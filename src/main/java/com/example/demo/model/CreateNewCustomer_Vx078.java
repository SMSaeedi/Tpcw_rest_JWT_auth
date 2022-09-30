package com.example.demo.model;

import com.example.demo.dataBaseConfig.Database;
import org.apache.tomcat.jni.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import static com.example.demo.model.TPCWUtil.DigSyl;
import static com.example.demo.model.TPCWUtil.formatDate;


public class CreateNewCustomer_Vx078 {

    public Customer createNewCustomer(Customer cust) {
        Connection con = Database.pickConnection();
        try {
            cust.c_discount = (int) (Math.random() * 51);
            cust.c_balance = 0.0;
            cust.c_ytd_pmt = 0.0;
            // FIXME - Use SQL CURRENT_TIME to do this
            cust.c_last_visit = new Date(System.currentTimeMillis());
            cust.c_since = new Date(System.currentTimeMillis());
            cust.c_login = new Date(System.currentTimeMillis());
            cust.c_expiration = new Date(System.currentTimeMillis() +
                    7200000);//milliseconds in 2 hours
            cust.addr_id = enterAddress(con,
                    cust.addr_street1,
                    cust.addr_street2,
                    cust.addr_city,
                    cust.addr_state,
                    cust.addr_zip,
                    cust.co_name);
            PreparedStatement get_max_id = con.prepareStatement("SELECT max(c_id) FROM customer");

            synchronized (Customer.class) {
                ResultSet rs = get_max_id.executeQuery();
                rs.next();
                cust.c_id = rs.getInt(1);//Is 1 the correct index?
                rs.close();
                cust.c_id += 1;
                cust.c_uname = DigSyl(cust.c_id, 0);
                cust.c_passwd = cust.c_uname.toLowerCase();
                Statement insert_customer_row = Database.createStatement(con);
                final String sql = "INSERT into tpcw_customer (c_id, c_uname, c_passwd, c_fname, c_lname, c_addr_id, c_phone, c_email, c_since, c_last_login, c_login, c_expiration, c_discount, c_balance, c_ytd_pmt, c_birthdate, c_data) " +
                        " VALUES (" + cust.c_id + ", \'" + cust.c_uname + "\', \'" +
                        cust.c_passwd + "\', \'" + cust.c_fname + "\', \'" + cust.c_lname + "\', " + cust.addr_id + ", \'" + cust.c_phone + "\', \'" + cust.c_email + "\', " + formatDate(cust.c_since) + ", " + formatDate(cust.c_last_visit) + ", " + formatDate(cust.c_login) + ", " + formatDate(cust.c_expiration) + ", " + cust.c_discount + ", " + cust.c_balance + ", " + cust.c_ytd_pmt + ", " + formatDate(cust.c_birthdate) + ", \'" + cust.c_data + "\')";
                insert_customer_row.executeUpdate(sql);// VxA_78
                con.commit();
                insert_customer_row.close();
            }
            get_max_id.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return cust;
    }

    private int enterAddress(Connection con, String street1, String street2, String city, String state, String zip, String country) {
        int addr_id = 0;
        try {
            PreparedStatement get_co_id = con.prepareStatement("SELECT co_id FROM tpcw_country WHERE co_name = ?");
            get_co_id.setString(1, country);
            ResultSet rs = get_co_id.executeQuery();// VxA_103
            rs.next();
            int addr_co_id = rs.getInt("co_id");
            rs.close();
            get_co_id.close();
            PreparedStatement match_address = con.prepareStatement("SELECT addr_id FROM tpcw_address " +
                    "WHERE addr_street1 = ? " +
                    "AND addr_street2 = ? " +
                    "AND addr_city = ? " +
                    "AND addr_state = ? " +
                    "AND addr_zip = ? " +
                    "AND addr_co_id = ?");
            match_address.setString(1, street1);
            match_address.setString(2, street2);
            match_address.setString(3, city);
            match_address.setString(4, state);
            match_address.setString(5, zip);
            match_address.setInt(6, addr_co_id);
            rs = match_address.executeQuery(); // VxA_113

            if (!rs.next()) {//We didn't match an tpcw_address in the addr table
                PreparedStatement insert_address_row = con.prepareStatement("INSERT into tpcw_address (addr_id, addr_street1, addr_street2, addr_city, addr_state, addr_zip, addr_co_id) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)");

                insert_address_row.setString(2, street1);
                insert_address_row.setString(3, street2);
                insert_address_row.setString(4, city);
                insert_address_row.setString(5, state);
                insert_address_row.setString(6, zip);
                insert_address_row.setInt(7, addr_co_id);

                PreparedStatement get_max_addr_id = con.prepareStatement("SELECT max(addr_id) FROM tpcw_address");
                synchronized (Address.class) {
                    ResultSet rs2 = get_max_addr_id.executeQuery();
                    rs2.next();
                    addr_id = rs2.getInt(1) + 1;

                    rs2.close();
                    //Need to insert a new row in the tpcw_address table
                    insert_address_row.setInt(1, addr_id);
                    insert_address_row.executeUpdate();// VxA_132
                }
                get_max_addr_id.close();
                insert_address_row.close();
            } else { //We actually matched
                addr_id = rs.getInt("addr_id");
            }
            match_address.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return addr_id;
    }
}
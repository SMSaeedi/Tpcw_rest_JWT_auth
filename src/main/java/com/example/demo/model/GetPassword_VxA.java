package com.example.demo.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetPassword_VxA {

    public String getPassword(String C_UNAME) {
        String passwd = null;
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            Statement get_passwd = Database.createStatement(con);
            // Set parameter
//            get_passwd.setString(1, );
            ResultSet rs = get_passwd.executeQuery("SELECT c_passwd FROM tpcw_customer WHERE c_uname = '" + C_UNAME + "'");
            // Results
            rs.next();
            passwd = rs.getString("c_passwd");
            rs.close();
            get_passwd.close();
            con.commit();
        } catch (Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return passwd;
    }
}
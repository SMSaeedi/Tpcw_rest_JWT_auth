package com.example.demo.model;

import java.sql.*;

public class AdminUpdate_Vx0 {

    public void adminUpdate(AdminUpdateInParams inParams) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/secured_service_db", "root", "@zhila920618261*");
            PreparedStatement st = con.prepareStatement("UPDATE adminupdate SET image = '" + inParams.getImage()
                    + "', thumbnail ='" + inParams.getThumbnail() + "'");
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.printf("update not successful");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public AdminUpdateOutParams hardCodeData(AdminUpdateInParams inParams) {
        AdminUpdateOutParams outSet = new AdminUpdateOutParams();
     /*   inParams.setI_id(01);
        inParams.setCost(5000);
        inParams.setImage("pic");
        inParams.setThumbnail("something");*/
        outSet.setList.add(inParams);
        return outSet;
    }
}
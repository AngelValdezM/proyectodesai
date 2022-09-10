package com.isil.sesion1;

import java.sql.*;

public class mainApp {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "angel2104");
        Statement stmt = con.createStatement();

        int resultUpdate = stmt.executeUpdate("update Users set phone='555444666' where name='Messi'");

        //if(result.getString("name").equals("Ronaldo"){
        //      System.out.println(result.getString("idUser"));
        //      System.out.println(result.getString("name"));
        //      System.out.println(result.getString("phone"));
        //      System.out.println(result.getString("city"));
        // }

        ResultSet result = stmt.executeQuery("select * from Users");

        while(result.next()){
            System.out.println(result.getString("idUser"));
            System.out.println(result.getString("name"));
            System.out.println(result.getString("phone"));
            System.out.println(result.getString("city"));
        }
    }
}

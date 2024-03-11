package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "Mohit_17";
        // get the connection object
        try(Connection connection = DriverManager.getConnection(url,username,password);
            // create a statement object
            Statement statement = connection.createStatement();) {
            //  the sql query to be executed
            String sql =
                    "create table employee(name varchar(20),employeeId int primary key,city varchar(20))";
            // pass the sql query inside execute method
            boolean result = statement.execute(sql);
            System.out.println("Table created " + !result);
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}

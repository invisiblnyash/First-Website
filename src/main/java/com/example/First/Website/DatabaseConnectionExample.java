package com.example.First.Website;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



    public class DatabaseConnectionExample {

        public static void main(String[] args) {
            // JDBC URL, username, and password of MySQL server
            String jdbcUrl = "jdbc:mysql://your_database_url:3306/your_database_name";
            String username = "your_username";
            String password = "your_password";

            try {
                // Register the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Open a connection
                System.out.println("Connecting to database...");
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Do something with the connection (e.g., execute queries, update data)

                // Close the connection
                connection.close();
                System.out.println("Connection closed.");

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }



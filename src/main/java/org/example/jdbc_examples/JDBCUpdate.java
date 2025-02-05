package org.example.jdbc_examples;

import java.sql.*;
import java.util.Scanner;

public class JDBCUpdate {

    static final String DB_URl = "jdbc:mysql://localhost:3306/test_db";
    static final String USER = "jpauser";
    static final String PWD = "jpapwd";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URl, USER, PWD);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name:");
            String enteredName = scanner.nextLine();

//            Statement statement = connection.createStatement();
//            String sqlQuery = "UPDATE students SET avg_grade = 7.5 " + "WHERE name = '" + enteredName + "'";
//            statement.executeUpdate(sqlQuery);
//
//            statement.close();

            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE students SET avg_grade = 7.5 WHERE name = ?");
            statement.setString(1, enteredName);
            statement.executeUpdate();

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

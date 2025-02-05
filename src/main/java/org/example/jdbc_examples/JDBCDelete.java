package org.example.jdbc_examples;

import java.sql.*;

public class JDBCDelete {

    static final String DB_URl = "jdbc:mysql://localhost:3306/test_db";
    static final String USER = "jpauser";
    static final String PWD = "jpapwd";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URl, USER, PWD);

            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM students WHERE surname = ?");
            statement.setString(1, "Tregulov");
            int deletedRows = statement.executeUpdate();
            System.out.println("deletedRows = " + deletedRows);

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

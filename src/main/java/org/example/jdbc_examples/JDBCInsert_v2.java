package org.example.jdbc_examples;

import org.example.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert_v2 {

    static final String DB_URl = "jdbc:mysql://localhost:3306/test_db";
    static final String USER = "jpauser";
    static final String PWD = "jpapwd";

    public static void main(String[] args) {

        Connection connection = null;
        Student student = new Student("Leo", "Farrel", 8.4);

        try {
            connection = DriverManager.getConnection(DB_URl, USER, PWD);
            Statement statement = connection.createStatement();
//            String sqlQuery = "INSERT INTO students(name, surname, avg_grade) VALUES" +
//                    "('" +
//                    student.getName() +
//                    "','" +
//                    student.getSurName() +
//                    "'," +
//                    student.getAvgGrade() +
//                    ")";
            String sqlQuery = "INSERT INTO students(name, surname, avg_grade) VALUES('Julia', 'Dean', 8.7)";

            statement.executeUpdate(sqlQuery);

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

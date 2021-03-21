/*
2. Write a program to retrieve the data from the table Student.
 */
package labmanual.week12;

import java.sql.*;

public class Question2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // search for the Driver class
        Class.forName("org.mariadb.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");

        // Create Statement
        Statement st = con.createStatement();

        // retrive records from the student table
        ResultSet result = st.executeQuery("select * from student");

        // print the result
        while (result.next()) {
            System.out.println("Student ID: " + result.getInt(1) + " Student Name: " + result.getString(2) + " Student Branch: " + result
            .getString(3) + " Student Address: " + result.getString(4));
        }

        // close the connection
        con.close();
    }
}

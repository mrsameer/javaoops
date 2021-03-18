/*
Demonstration of select statement
 */
package jdbc;

import java.sql.*;

public class Myjdbcapp3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // search for Driver class name in org.mariadb.jdbc pacakge
        Class.forName("org.mariadb.jdbc.Driver");

        // establish connection to the database named test
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");

        //create Statement object
        Statement stmt = con.createStatement();

        // select all the records in the employees table
        ResultSet resultSet = stmt.executeQuery("select * from employees");

        // Display result
        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2) + ", " + resultSet.getDouble(3) + ", "+ resultSet.getString(4));
        }

        con.close();
    }
}

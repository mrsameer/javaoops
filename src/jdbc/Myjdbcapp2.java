/*
 Inserting data into table
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Myjdbcapp2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // search for Driver class
        Class.forName("org.mariadb.jdbc.Driver");

        // establish connection
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");

        // Create variables
        int eno;
        String ename;
        Double esal;
        String eadd;

        // create statement
        String stmt ;
        // Create Statement object
        Statement s = con.createStatement();

        int count;
        System.out.print("Enter the number of records to insert: ");
        count = sc.nextInt();

        while (count-- != 0) {
            System.out.print("Enter the employee number: ");
            eno = sc.nextInt();
            System.out.print("Enter the employee name: ");
            ename = sc.next();
            System.out.print("Enter the employee salary: ");
            esal = sc.nextDouble();
            System.out.print("Enter the employee address: ");
            eadd = sc.next();

            stmt = "insert into employees(eno, ename, esal, eadd) values(" + eno + ",'" + ename + "'," + esal + ",'" + eadd + "')";
            s.executeUpdate(stmt);
        }
        con.close();
        System.out.println("Successfully inserted");
    }
}

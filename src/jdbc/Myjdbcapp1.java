package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Myjdbcapp1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // search for Driver class
        Class.forName("org.mariadb.jdbc.Driver");

        // establish connection
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");

        // create a statement (statement is a like a vehicle to transport queries)
        Statement st = con.createStatement();

        st.executeUpdate("create table employees(eno integer, ename varchar(50), esal real(10, 2), eadd varchar (50), constraint pk_employees primary key(eno))");
        System.out.println("Table created successfully");

        //close the connection
        con.close();
    }
}

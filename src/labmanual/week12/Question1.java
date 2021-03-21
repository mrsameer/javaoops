/*
1. Write a program to insert data into Student Table.
 */
package labmanual.week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // search for Driver class in org.mariadb.jdbc package
        Class.forName("org.mariadb.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");

        // create Statement object
        Statement st = con.createStatement();

        // create relation student in database named test
        st.executeUpdate("create table student(sid integer, sname varchar(30), sbranch varchar(50), sadd varchar(50), constraint pk_student primary key (sid))");

        System.out.println("Created table student in databased named test");

        // insert three student records into student relation
        st.executeUpdate("insert into student(sid, sname, sbranch, sadd) values(1, 'sameer', 'computer science engineering', 'new york')");
        st.executeUpdate("insert into student(sid, sname, sbranch, sadd) values(2, 'james', 'computer science engineering', 'london')");
        st.executeUpdate("insert into student(sid, sname, sbranch, sadd) values(3, 'mark', 'electrical and electronics engineering', 'new york')");

        System.out.println("Inserted records into relation student");

        // close the connection
        System.out.println("Closed connection to the database");
    }
}

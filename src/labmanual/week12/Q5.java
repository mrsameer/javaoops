/*
5. Write a program to Store and retrieve file content from the Data base.
 */
package labmanual.week12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;

public class Q5 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");
        System.out.println("Connection established");

        Statement statement = connection.createStatement();
        statement.executeUpdate("create table files(id integer, file text, primary key(id))");
        System.out.println("Created table images");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into files(id, file) values(?,?)");
        preparedStatement.setInt(1, 1);

        FileReader fileReader = new FileReader("/home/sameer/Desktop/semester/javaoops/src/labmanual/week12/hello.txt");
        preparedStatement.setCharacterStream(2, fileReader);
        preparedStatement.execute();
        System.out.println("Inserted file");

        // retrieving file data from database
        ResultSet resultSet = statement.executeQuery("select * from files");
        while (resultSet.next()) {
            System.out.println("File id: " + resultSet.getInt(1));
            System.out.println("File data: " + resultSet.getCharacterStream(2));
        }
        connection.close();
        System.out.println("Closed connection");
    }
}

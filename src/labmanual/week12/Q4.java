/*
4. Write a program to store an Image and retrieve an image from Database
 */
package labmanual.week12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class Q4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test");
        System.out.println("Connection established");

        Statement statement = connection.createStatement();
        statement.executeUpdate("create table images(id integer, image blob, primary key(id))");
        System.out.println("Created table images");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into images(id, image) values(?,?)");
        preparedStatement.setInt(1, 1);

        FileInputStream fileInputStream = new FileInputStream("/home/sameer/Desktop/semester/javaoops/src/labmanual/week11/logo.jpeg");
        preparedStatement.setBinaryStream(2, fileInputStream);
        preparedStatement.execute();
        System.out.println("Inserted image");

        ResultSet resultSet = statement.executeQuery("select * from images");
        while (resultSet.next()) {
            System.out.println("Id of the image: " + resultSet.getInt(1));
            System.out.println("Image: " + resultSet.getBlob(2));
        }

        connection.close();
    }
}

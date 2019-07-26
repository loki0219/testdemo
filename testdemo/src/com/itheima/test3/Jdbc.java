package com.itheima.test3;
import java.sql.*;

/**
 * @author: LOKI
 * @date: 2019/7/22 14:07
 */
public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()){
            System.out.println(resultSet);
        }

    }
}

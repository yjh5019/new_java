package testtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Statement statement = null;
      ResultSet resultSet = null;
      Connection connection = null;
      String id = "root";
      String password = "1234";
      String dbQuery = "show databases";
      
      try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul&useSSL=false", id, password);
         statement = connection.createStatement();
         
         if (statement.execute(dbQuery)) {
            resultSet = statement.getResultSet();
         }
         
         while (resultSet.next()) {
            String str = resultSet.getString(1);
            System.out.println(str);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}
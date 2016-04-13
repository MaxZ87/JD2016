package by.it.zebnitskiy.JD_03.JD_03_01.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Created by Зебницкий Максим on 4/11/2016.
 */
public class Ex_03Select {
        public static void main(String[ ] args) {
            try (Connection connection=
                         DriverManager.getConnection
                                 ("jdbc:mysql://127.0.0.1:2016/bloknot","root", "root");
                 Statement statement=connection.createStatement();) {
                //получаем пользователей
                ResultSet resultSet=statement.executeQuery("select * from users;");
                while (resultSet.next()){
                    String out=resultSet.getString("Email")+", "+resultSet.getString("Login");
                    System.out.println(out);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}

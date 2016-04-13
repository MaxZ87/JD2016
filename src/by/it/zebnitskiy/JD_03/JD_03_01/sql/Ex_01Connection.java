package by.it.zebnitskiy.JD_03.JD_03_01.sql;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Created by Зебницкий Максим on 4/11/2016.
 */
public class Ex_01Connection {
            public static void main(String[ ] args) {
            //устаревший способ регистрации. Сейчас уже не требуется.
            //Driver driver=new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);
            try (Connection connection=
                         DriverManager.getConnection
                                 ("jdbc:mysql://localhost:2016/it_academy?useUnicode=true&amp;characterEncoding=UTF-8","root", "");) {
                if (!connection.isClosed())
                    System.out.println("Соединение установлено");
                connection.close();
                if (connection.isClosed())
                    System.out.println("Соединение прервано");
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
}

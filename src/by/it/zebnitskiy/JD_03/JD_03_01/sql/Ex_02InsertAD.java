package by.it.zebnitskiy.JD_03.JD_03_01.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 * Created by Зебницкий Максим on 4/11/2016.
 */
public class Ex_02InsertAD {
    public static void main(String[ ] args) {
            try (Connection connection=
                         DriverManager.getConnection
                                 ("jdbc:mysql://127.0.0.1:2016/bloknot","root", "root");

                 Statement statement=connection.createStatement();) {

                //вставляем объявления
                statement.executeUpdate(
                        "insert into person('ID', 'name', 'address', 'phone', 'birthday', 'FK_city_1')\n" +
                                "VALUES(1, 'Dima', 'Pushkina', 8913452, 3021989, 16);"
                );
                statement.executeUpdate(
                        "insert into person('ID', 'name', 'address', 'phone', 'birthday', 'FK_city_1')\n" +
                                "VALUES(2, 'lima', 'nushkina', 1113452, 2221989, 16);"            );
                statement.executeUpdate(
                        "insert into person('ID', 'name', 'address', 'phone', 'birthday', 'FK_city_1')\n" +
                                "VALUES(3, 'vima', 'sushkina', 2313452, 1311989, 16);"            );
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
}

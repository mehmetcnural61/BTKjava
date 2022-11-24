package JDBC.JdbcIntro;

import java.sql.*;

public class Main {


    public static void main(String[] args) throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;

        //İfade, Cümleciğimiz
        Statement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select code,Name,Continent,Region from Country");
            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }


    }
}

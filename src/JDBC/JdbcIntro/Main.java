package JDBC.JdbcIntro;

import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();


        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnection();
            String sql="delete from city where name='izmir' ";
            statement=connection.prepareStatement(sql);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Silindi !");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void selectDemo() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;

        //İfade, Cümleciğimiz
        Statement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select code,Name,Continent,Region from Country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
    public static void insertData()throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();


        //İfade, Cümleciğimiz
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnection();
            String sql= "insert into city (Name,CountryCode,District,Population)values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"İzmir");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,35000);



            //how many rows affected
            int result = statement.executeUpdate();

            System.out.println("Kayıt Eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public void updateData()throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();


        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnection();
            String sql="update city set population=61000,district='EGE' ";
            // String sql="update city set population=61000,district='EGE' where id=? ";
            statement=connection.prepareStatement(sql);
            // statement.setInt(1,4082);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Güncellendi !");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}


package JDBC.JdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String username = "root";
    private String passWord = "616161";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    //Bağlantımızı oluşturuyoruz
    public Connection getConnection() throws SQLException {
      return  DriverManager.getConnection(dbUrl,username,passWord);
    }

    public void showErrorMessage(SQLException exception){
      System.out.println("Error: "+exception.getMessage());
      System.out.println("Error Code: "+exception.getErrorCode());
    }

}

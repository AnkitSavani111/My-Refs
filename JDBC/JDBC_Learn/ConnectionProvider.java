package JDBC_Learn;
import java.sql.*;

public class ConnectionProvider {

    public static void main(String[] args) {

    }
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                // Load Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create Connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn_jdbc", "root", "ankitsavani12345");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

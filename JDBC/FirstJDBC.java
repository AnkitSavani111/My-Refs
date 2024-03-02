
// First JDBC Program
import java.sql.*;

class FirstJDBC {
    public static void main(String[] args) {
        try {
            // Load The Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/learn_jdbc";
            String username = "root";
            String password = "ankitsavani12345";

            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is Created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
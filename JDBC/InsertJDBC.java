import java.sql.*;

class InsertJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/learn_jdbc";
            String username = "root";
            String password = "ankitsavani12345";

            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is Created");
            }

            // Create a statement
            String createTable = "create table if not exists student (id int primary key auto_increment, name varchar(255), email varchar(255), phone varchar(255))";
            Statement st = con.createStatement();

            // Execute the statement
            st.executeUpdate(createTable);

            System.out.println("Table is created");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.sql.*;

class preparedStatement{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            

            // Create a connection
            String url = "jdbc:mysql://localhost:3306/learn_jdbc";
            String username = "root";
            String password = "ankitsavani12345";

            Connection con = DriverManager.getConnection(url, username, password);

            // Create a Query
            // id increments automatically
            String query = "insert into student (name, email, phone) values (?, ?, ?)";

            // get the prepared statement object
            // PreparedStatement is an interface but prepareStatement() is a method of Connection class
            PreparedStatement st = con.prepareStatement(query);

            // set the values
            st.setString(1, "Ankit Savani");
            st.setString(2, "test@gmail.com");
            st.setString(3, "1234567890");

            // execute the query
            st.executeUpdate();

            System.out.println("Data is inserted");

            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
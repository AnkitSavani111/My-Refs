import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class dynamicInput {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/learn_jdbc";
            String username = "root";
            String password = "ankitsavani12345";

            Connection con = DriverManager.getConnection(url, username, password);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the name: ");
            String name = br.readLine();

            System.out.println("Enter the email: ");
            String email = br.readLine();

            System.out.println("Enter the phone: ");
            String phone = br.readLine();

            String query = "insert into student (name, email, phone) values (?, ?, ?)";

            
            // PreparedStatement is an interface but prepareStatement() is a method of Connection class
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, phone);

            st.execute();

            System.out.println("Data is inserted");

            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
}

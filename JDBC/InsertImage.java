import java.sql.*;
import java.io.*;

class InsertImage{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn_jdbc", "root", "ankitsavani12345");

            // Insert image Query
            String q = "insert into images(pic) values(?)"; 

            // Convert image into byte array
            FileInputStream fis = new FileInputStream("download.jpeg");

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(q);

            // Set binary stream
            ps.setBinaryStream(1, fis, fis.available());

            // Execute query
            ps.executeUpdate(); 
            
            System.out.println("Image inserted successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
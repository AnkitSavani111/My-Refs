package JDBC_Learn;

import java.sql.*;
import java.io.*;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            String q = "insert into images(pic) values(?)";

            PreparedStatement psmt = con.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);

            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);

            psmt.setBinaryStream(1, fis, fis.available());

            // Execute query
            psmt.executeUpdate();

            System.out.println("Image inserted successfully");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

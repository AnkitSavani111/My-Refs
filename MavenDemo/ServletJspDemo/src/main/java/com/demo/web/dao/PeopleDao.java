package com.demo.web.dao;
import java.sql.*;
import com.demo.web.Model.People;

public class PeopleDao {
	public People getPeople(int id){
		People pip = new People();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "ankitsavani12345");
			Statement st =  con.createStatement();
			ResultSet rs = st.executeQuery("select * from people where id="+ id);
			if(rs.next()) {
				pip.setPid(rs.getInt("id"));
				pip.setPname(rs.getString("pname"));
				pip.setPtech(rs.getString("ptech"));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return pip;
	}
}
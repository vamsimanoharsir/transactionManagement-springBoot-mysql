package net.codejava;
import java.sql.*;
public class dbdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
			System.out.println("Connected to the database");
			Statement stmt=con.createStatement();
			String sqq="delete from student where id='3'";
			stmt.executeUpdate(sqq);
			System.out.println("Record specified is deleted!!");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

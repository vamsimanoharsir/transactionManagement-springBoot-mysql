package net.codejava;
import java.sql.*;
import java.util.*;
public class dbinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
			System.out.println("Connected to the database");
			Statement stmt=con.createStatement();
			int res=stmt.executeUpdate("insert into student values('5','mahesh','fifth','55')");
			if(res>0)
				System.out.println("The data has been successfully inserted!!");
			else
				System.out.println("Insertion failed!");
			
			con.close();
			System.out.println("Database connection has been closed!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}

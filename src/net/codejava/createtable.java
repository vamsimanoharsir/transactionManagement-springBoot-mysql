package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class createtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
			System.out.println("Connected to the database");
			Statement stmt=con.createStatement();
			
			System.out.println("Creating a new table : ");
			String sql = "CREATE TABLE stud " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	         System.out.println("Successfully Created table in given database");  
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

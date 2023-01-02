package net.codejava;
import java.sql.*;
public class batchprocessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
			System.out.println("Connected to the database");
			Statement stmt=con.createStatement();
			
			con.setAutoCommit(false);
			String stt="insert into student values('6','suresh','sixth','60')";
			stmt.addBatch(stt);
			String stt1="insert into student values('7','bunny','seven','50')";
			stmt.addBatch(stt1);
			String stt2="update student set id='8' where name='vamsi'";
			stmt.addBatch(stt2);
			int[] count = stmt.executeBatch();
			con.commit();
			System.out.println("Batch processing successful!!");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

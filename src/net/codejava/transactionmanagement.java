package net.codejava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class transactionmanagement {
	public static void main(String args[]) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
		System.out.println("Connected to the database");
		Statement stmt=con.createStatement();
		con.setAutoCommit(false); 
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter name");  
		String name=br.readLine();  
		  
		System.out.println("enter class");  
		String clas=br.readLine();
		
		System.out.println("enter marks");  
		String s4=br.readLine();  
		int marks=Integer.parseInt(s4); 
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setString(3,clas);  
		ps.setInt(4, marks);
		
		ps.executeUpdate();  
		  
		System.out.println("Enter commit/rollback : ");  
		String answer=br.readLine();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback();  
		}  
		  
		  
		System.out.println("Want to add more records : y/n ");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		con.commit();  
		System.out.println("The data is successfully committed!!");  
		
	} catch (Exception e) {
		System.out.println(e);
	}

}}

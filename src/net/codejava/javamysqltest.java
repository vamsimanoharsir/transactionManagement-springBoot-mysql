package net.codejava;
import java.sql.*;
public class javamysqltest {

	public static void main(String[] args) throws Exception {
		        Class.forName("com.mysql.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");

		        System.out.println("Connection established!!");
		        
		        Statement stmt=con.createStatement();
		        ResultSet rs=stmt.executeQuery("select * from student"); 
		        while(rs.next()){
		        int id=rs.getInt("id");
		        String name=rs.getString("name");
		        String clas=rs.getString("class");
		        int marks=rs.getInt("marks");
		        System.out.println("Details are : "+id+" "+name+" "+clas+" "+marks);
	}
		        stmt.close();
		        con.close();
		        
		        }
}
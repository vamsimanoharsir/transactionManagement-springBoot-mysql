package net.codejava;
import java.sql.*;
public class dbupdate {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded...");
     
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Vamsi@1999");
        System.out.println("Connected to the database");
    	
        Statement st=con.createStatement();
        
        st.executeUpdate("update student set name='Kishore' where id='3'");
        System.out.println("row updated successfully!!");
         
        con.close();
        System.out.println("Connection closed");

	}

}
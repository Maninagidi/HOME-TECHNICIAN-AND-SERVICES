package home;

import java.util.Scanner;
import java.sql.*;

public class slot{
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3308/services";
	String username="root";
	String pass="mANI@7272";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}


	Scanner sc1 = new Scanner(System.in);


	public void washingmachine_repair() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into washingmachine_repair(name,address,repair_date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter user Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter user address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter user repair_date");
		             String soc = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,soc);
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		       
		       }  
		 
		// TODO Auto-generated method stub
		
		
	
	public void call_repair()throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into call_repair(name,address,date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter user Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter  user address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter user date");
		             String soc = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,soc);
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		       
		// TODO Auto-generated method stub
		
	}
		// TODO Auto-generated method stub
		
	

	public void camera() throws SQLException{
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into Camera(name,address,repair_date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter user Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter user address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter user repair_date");
		             String soc = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,soc);
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		       
	// TODO Auto-generated method stub
	
}


		// TODO Auto-generated method stub
		
	}



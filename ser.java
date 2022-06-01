package home;
import java.util.Scanner;
import java.sql.*;
public class ser {
	public static void main(String[] args) throws SQLException
	 {
	String p="y";
	String s = "y";
	String usern,passw;
	outer: while (true) {

	Scanner sc1 = new Scanner(System.in);
	System.out.println("**********WELCOME TO HOME-TECHNICIAN-AND SERVICES**********");
	

	System.out.println("Please Enter The LOGIN DETAILS:");

	System.out.println("Enter Admin Name: ");
	usern = sc1.nextLine();
	System.out.println("Enter Admin Password: ");
	passw = sc1.nextLine();

	if(usern.equals("Manikanta") && passw.equals("Mani@7272"))
	{
	System.out.println("your authentication is succefull");



	while (s.equals("y")) {
	System.out.println("SERVICES PROVIDED BY US");
	System.out.println("press 1 to choose washingmachine_repair");
	System.out.println("press 2 to choose call_repair");
	System.out.println("press 3 to choose camera");
	System.out.println("press 4 to choose EXIT");

	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();

	slot bb = new slot();

	switch (i) {
	case 1: bb.washingmachine_repair();
	break;
	case 2: bb.call_repair();
	break;
	case 3: bb.camera();
	break;
	case 4: System.exit(0);
	default : System.out.println("Wrong Choice");
	break;
	}
	System.out.println("want to continue press y/n");
	s = sc.next();
	if (s.equals("n"));
	{
		System.out.println("******THE END******");
		break outer ;
	}
}
		
}
	else {
	System.out.println("INVALID. Please Enter Correct Details: ");
	System.out.println("want to continue press y/n");
	 p = sc1.next();
	      }
	   }
	 }
       
}



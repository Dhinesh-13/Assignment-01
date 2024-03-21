package poco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in=new Scanner(System.in);
	static protected ArrayList<String>user=new ArrayList<String>();
	static protected ArrayList<String>usernn=new ArrayList<String>();
	static protected ArrayList<String>useremail=new ArrayList<String>();
	static protected ArrayList<String>userpassword=new ArrayList<String>();
	static protected ArrayList<String>userphone=new ArrayList<String>();
	static protected ArrayList<String>subscriptionid=new ArrayList<String>();
	static protected ArrayList<String>subscriptionss=new ArrayList<String>();
	static protected ArrayList<String>planid=new ArrayList<String>();
	static protected ArrayList<String>sdate=new ArrayList<String>();
	static protected ArrayList<String>edate=new ArrayList<String>();
	public static void homepage()
	{
		System.out.println("1.Login");
		System.out.println();
		System.out.println("2.Create your account");
		System.out.println();
		System.out.println("3.Exit");
		System.out.println();
		int n=in.nextInt();
		login call=new login();
		class_accountCreate  create=new class_accountCreate ();
		switch(n)
		{
			case 1:
				call.details();
			case 2:
				create.account();
			case 3:
				System.out.print("Thank you");
				break;
				
				
		}
	}
	public static void main(String[] args) {

				System.out.println("Welcome");
				System.out.println();
				homepage();
				
	}

}

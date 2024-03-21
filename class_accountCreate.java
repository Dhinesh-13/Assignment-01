package poco;

public class class_accountCreate extends Main {
	public static void account() {
		Main call=new Main();
		System.out.println("-------------------------user form---------------------------");
		System.out.println();
		System.out.print("Enter the userID : ");
		String userid=in.next();
		for(int i=0;i<user.size();i++)
		{
			if(userid.equals(user.get(i)))
			{
				System.err.println("The user name already exist");
				System.err.println("Try again");
				account();
				break;
			}
		}
		user.add(userid);
		System.out.println();
		System.out.print("Enter the user name : ");
		String username=in.next();
		int o=1;
		subscriptionid.add(userid+o++);
		subscriptionss.add("Inactive");
		sdate.add("Null");
		edate.add("Null");
		planid.add("Null");
		usernn.add(username);
		System.out.println();
		System.out.print("Enter the email : ");
		String email=in.next();
		useremail.add(email);
		System.out.println();
		//System.out.println();
		System.out.print("Enter the Password : ");
		String password=in.next();
		userpassword.add(password);
		System.out.println();
		System.out.print("Enter the Phone number: ");
		//System.out.println();
		String phone=in.next();
		userphone.add(phone);
		System.out.println();
		System.out.println("----------------------complete your profile------------------");
		System.out.println();
		call.homepage();
	}
}

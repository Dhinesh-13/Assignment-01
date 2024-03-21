package poco;

public class class_update extends Main {
	static login o=new login();
	public static void update(String a2,String a3)
	{
		int k=0;
	for(int i=0;i<user.size();i++)
	{
		if(a2.equals(user.get(i))   )
		{
			if(a3.equals(userpassword.get(i)))
			{
			 k=1;
			System.out.println("1.Update your name");
			System.out.println();
			System.out.println("2.Update your email");
			System.out.println();
			System.out.println("3.Update your Phone Number");
			System.out.println();
			System.out.println("4.Update your Password");
			System.out.println();
			int f=in.nextInt();
			switch(f)
			{
				case 1:
					System.out.print("Enter the user name : ");
						String username1=in.next();
					usernn.set(i,username1);
					System.out.println();
					System.out.println("----------------------update complete your profile------------------");
					o.optaion();
					break;
				case 2:
					System.out.print("Enter the email : ");
					String email1=in.next();
					useremail.set(i,email1);
					System.out.println();
					System.out.println("----------------------update complete your profile------------------");
					o.optaion();
					break;
				case 3:
					System.out.print("Enter the Phone number: ");
					//System.out.println();
					String phone1=in.next();
					userphone.set(i,phone1);
					System.out.println();
					System.out.println("----------------------update complete your profile------------------");
					o.optaion();
					break;
				case 4:
					System.out.print("Enter the Password : ");
					String password1=in.next();
					System.out.print("Enter the conform  Password : ");
					String password2=in.next();
					if(password1.equals(password2))
					{
						userpassword.set(i,password1);
						System.out.println("----------------------update complete your profile------------------");
						o.optaion();
						break;
					}
					else
					{
						System.out.println("Invalid password");
						o.optaion();
						break;
					}
			}
		}
	}
	
}
}
}

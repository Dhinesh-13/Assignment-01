package poco;

public class login extends Main {
	static boolean flage=false;
	static String us;
	static String up;
	static Main call=new Main();
	static class_update call1=new class_update();
	public static void details()
	{
		System.out.print("Enter the user id :");
		String user_id=in.next();
	//	class_profileShow id_user=new class_profileShow(user_id);
		System.out.print("Enter the password :");
		String password_=in.next();
		//class_profileShow u=new class_profileShow(user_id,password_);
		
		
		for(int i=0;i<user.size();i++)
		{
			
			if(user_id.equals(user.get(i))&&  password_.equals(userpassword.get(i)))
			{
				flage =true;
				us=user_id;
				up=password_;
				//value=i;
				optaion();
			}
		}
		if(flage==false)
		{
			System.err.println("Invalid User or password Try again");
			System.out.println();
			call.homepage();
		}
	}
	public static void optaion()
	{
		if(flage == true)
		{
			System.out.println("1.Show the profile");
			System.out.println();
			System.out.println("2.Update your profile");
			System.out.println();
			System.out.println("3.Service Plan");
			System.out.println();
			System.out.println("4.Subscription");
			System.out.println();
			System.out.println("5.Billing");
			System.out.println();
			System.out.println("6.Exit");
			int z=in.nextInt();
			class_profileShow o=new class_profileShow();
			class_exit o1=new class_exit();
			class_serviceplan o2=new class_serviceplan();
			 class_subscription o3=new  class_subscription();
			 class_billing o4=new class_billing();
			switch(z)
			{
				case 1:	
					o.showprofie(us,up);
					break;
				case 2:
					call1.update(us,up);
					break;
				case 3:
					o2.plane(us,up);
					break;
				case 4:
					o3.plane(us,up);
					break;
				case 5:
					o4.billing(us,up);
				default:
					o1.exit();
					break;
					
					
			}
		
	}
	
}
}
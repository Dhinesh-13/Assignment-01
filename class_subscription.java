package poco;

public class class_subscription extends Main {
	public static void plane(String a,String b)
	{
		login o=new login();
		for(int i=0;i<user.size();i++)
		{
			
			if(a.equals(user.get(i))&& b.equals(userpassword.get(i)))
			{
				System.out.println("User name : "+usernn.get(i));
				System.out.println("subscription : "+subscriptionid.get(i));
				System.out.println("subscription status : "+subscriptionss.get(i));
				System.out.println("Plane id : "+planid.get(i));
				System.out.println("Start Date : "+sdate.get(i));
				System.out.println("End Date : "+edate.get(i));
				o.optaion();
			}
			}
	}
}

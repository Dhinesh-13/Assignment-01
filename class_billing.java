package poco;

public class class_billing extends Main{
	public static void billing(String a,String b)
	{
		login o=new login();
		for(int i=0;i<user.size();i++)
		{
			
			if(a.equals(user.get(i))&&  b.equals(userpassword.get(i)))
			{
				System.out.println("Payment ID : "+planid.get(i));
				System.out.println("Next Due Date : "+edate.get(i));
				o.optaion();
			}
		}
	}
}

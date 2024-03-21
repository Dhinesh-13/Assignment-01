package poco;

public class class_feedback extends Main{
	public static void rating()
	{
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		int k=in.nextInt();
		if(k<3)
		{
			String a=in.nextLine();
			System.out.println("----------Thank you--------------");
			homepage();
		}
		else
		{
			System.out.println("----------Thank you--------------");
			homepage();
		}
	}
}

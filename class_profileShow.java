package poco;

public class class_profileShow extends Main {

	static login o=new login();

		public static void showprofie(String uid,String upas)
		{
			for(int i=0;i<user.size();i++) {
				if(uid.equals(user.get(i))&&  upas.equals(userpassword.get(i)))
				{
				System.out.println(i);
				System.out.println("--------------------Your details-------------------------");
				System.out.println(user.get(i));
				System.out.println();
				System.out.println(usernn.get(i));
				System.out.println();
				System.out.println(useremail.get(i));
				System.out.println();
				System.out.println(userphone.get(i));
				System.out.println();
				System.out.println("--------------------------------------------------------");
				o.optaion();
			}
			}
		}		
}

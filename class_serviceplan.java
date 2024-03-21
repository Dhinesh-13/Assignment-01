package poco;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class class_serviceplan extends Main {
	public static void plane(String a,String b)
	{
		
		for(int i=0;i<user.size();i++)
		{
			
			if(a.equals(user.get(i))&&  b.equals(userpassword.get(i)))
			{
				System.out.println("1.Plan ID: 001\r\n"
						+ "Plan Name: Basic Wi-Fi Plan\r\n"
						+ "Price: $30 per month\r\n"
						+ "Validity: 30 days\r\n"
						+ "Data Limit: 50 GB\r\n"
						+ "Speed: Up to 50 Mbps");
				System.out.println();
				System.out.println("2.Plan ID: 002\r\n"
						+ "Plan Name: Standard Wi-Fi Plan\r\n"
						+ "Price: $50 per month\r\n"
						+ "Validity: 30 days\r\n"
						+ "Data Limit: 100 GB\r\n"
						+ "Speed: Up to 100 Mbps");
				System.out.println();
				System.out.println("3.Plan ID: 002\r\n"
						+ "Plan Name: Standard Wi-Fi Plan\r\n"
						+ "Price: $50 per month\r\n"
						+ "Validity: 30 days\r\n"
						+ "Data Limit: 100 GB\r\n"
						+ "Speed: Up to 100 Mbps");
				System.out.println();
				System.out.println("Plan ID: 003\r\n"
						+ "Plan Name: Premium Wi-Fi Plan\r\n"
						+ "Price: $80 per month\r\n"
						+ "Validity: 30 days\r\n"
						+ "Data Limit: Unlimited\r\n"
						+ "Speed: Up to 200 Mbps");
				System.out.println();
				Date d=new Date();
				String output1=""+d;
				 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			        Calendar calendar = Calendar.getInstance();
			        calendar.setTime(new Date()); // Set to today's date
			        calendar.add(Calendar.DATE, 30); // Add 5 days
			        String output2 = sdf.format(calendar.getTime());
			        class_feedback o=new class_feedback();
			        
				int k=in.nextInt();
				switch(k)
				{
					case 1:
						subscriptionss.set(i, "Active");
						planid.set(i, "001");
						sdate.set(i, output1);
						edate.set(i, output2);
						System.out.println("------------------your Recharge Successful-----------------");
						o.rating();
						break;
					case 2:
						subscriptionss.set(i, "Active");
						planid.set(i, "002");
						sdate.set(i, output1);
						edate.set(i, output2);
						System.out.println("------------------your Recharge Successful-----------------");
						o.rating();
						break;
					case 3:
						subscriptionss.set(i, "Active");
						planid.set(i, "003");
						sdate.set(i, output1);
						edate.set(i, output2);
						System.out.println("------------------your Recharge Successful-----------------");
						o.rating();
						break;
					case 4:
						subscriptionss.set(i, "Active");
						planid.set(i, "004");
						sdate.set(i, output1);
						edate.set(i, output2);
						System.out.println("------------------your Recharge Successful-----------------");
						o.rating();
						break;
				}
				
			}
		}
	}
}

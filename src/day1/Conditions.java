package day1;

public class Conditions {

	public static void main(String[] args) {
		
		int bill = 3900;
		int rc = 1000;
		// conditional statements
		// If - else , nested if , if else ladder.
//		if(bill < 4000)
//		{
//			if(bill + rc < 4000)
//			{
//				System.out.println("I'll buy the RC car");
//			}
//			else
//			{
//				System.out.println("I'll buy something else");
//			}
//			
//		}
//		else
//		{
//			System.out.println("I wont buy anything");
//		}
		
		
//		if else ladder
		if(bill > 4000)
		{
			System.out.println("I wont buy anything");
		}
		else if(bill < 4000 && bill + rc < 4000)
		{
			System.out.println("Buy the Rc car");
		}
		else if(bill < 4000 && bill + 250 < 4000)
		{
			System.out.println("Buy Chocolates");
		}
		else
		{
			System.out.println("go home with the balance");
		}

	}

}

package day6;

import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				int x = 15;
				int y = sc.nextInt();
				int z = x/y;
				System.out.println(z);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Bro Arthmetic Error");
			}
			catch(Exception e)
			{
				System.out.println("Error occured Dude!!!\n" + e);
			}
			finally
			{
				System.out.println("Finally block");
			}
		}


	}

}

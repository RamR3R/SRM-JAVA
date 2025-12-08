package day1;

public class Switch {

	public static void main(String[] args) {
		
		int choice = 1;
		switch(choice) // not exactly a switch but a kind of jump statement
		{
			case 1:
				System.out.println("Tamil");
				break;
			case 2:
				System.out.println("Hindi");
				break;
			case 3:
				System.out.println("Telugu");
				break;
			case 4:
				System.out.println("English");
				break;
			case 5:
				System.out.println("Repeat it");
				break;
			default:
				System.out.println("Invalid choice");
		}
		// for getting out of a block we will be using break statement
		

	}

}

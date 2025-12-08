package day3;

public class StringSession {

	public static void main(String[] args) {
		String str1 = "imppenible";
		String find = "pen";
		int i = 0;
		int j = 0;
		while(j < find.length() && i < str1.length())
		{
			if(str1.charAt(i) == find.charAt(j))
			{
				j++;
				i++;
			}
			else{
				if(j > 0)
					j = 0;
				else
					i++;
			}
			
			if(j == find.length())
				System.out.println("Found " + find + " in " + str1);	
		}
		
		
	}

}

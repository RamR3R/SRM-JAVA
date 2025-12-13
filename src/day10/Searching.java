package day10;

import java.util.Scanner;

// count 42
//Linear Searching
public class Searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {34,45,46,57,45,78,97,12,23};
		
		int target = 45;
		int index = -1;
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(arr[i] == target)
			{
				index = i;
				break;
			}
		}
		if(index == -1)
			System.out.println("Not Found Bro!!!");
		else
			System.out.println("Found Bro in Index " + index);
		
	}

}

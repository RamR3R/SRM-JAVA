package day9;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<>();
		
		for(int i = 0 ; i<s.length() ; i++)
		{
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{')
				st.push(c);
			else
			{
				if(c == ')' && st.peek() == '(')
					st.pop();
				else if(c == '}' && st.peek() == '{')
					st.pop();
				else if(c == ']' && st.peek() == '[')
					st.pop();
				else
				{
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		if(st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("UnBalanced");
		
		
	}

}

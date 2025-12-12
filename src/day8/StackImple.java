package day8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackImple {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		if(!st.isEmpty())
			System.out.println(st.peek());  //null , 0
		st.push(67);
		st.push(69);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.push(45);
		System.out.println(st.peek());
		System.out.println(st.size());

		
	}

}

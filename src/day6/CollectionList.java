package day6;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(45);
		list1.add(32);
		System.out.println(list1);
		list1.add(0, 37);
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
	}

}

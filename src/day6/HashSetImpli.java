package day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetImpli {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj = new TreeSet<>();
		obj.add(45);
		System.out.println(obj);
		obj.add(36);
		System.out.println(obj);
		obj.add(37);
		System.out.println(obj);
		obj.add(37);
		System.out.println(obj);
	}

}

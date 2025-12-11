package day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapMain {

	public static void main(String[] args) {
		TreeMap<Integer , String> map = new TreeMap<>();
		
		map.put(500, "Ram");
		map.put(200, "Sam");
		map.put(300, "Jam");
		map.put(600, "Java");
		String x = map.get(500);
		String y = map.getOrDefault(600, "no name");
		System.out.println(map.entrySet());
		
	}

}

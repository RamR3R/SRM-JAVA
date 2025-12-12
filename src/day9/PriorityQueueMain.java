package day9;

import java.util.Comparator;
import java.util.PriorityQueue;

class pairs{
	String value;
	int priority;
	
	pairs(String value, int priority)
	{
		this.value = value;
		this.priority = priority;
	}
	
	public String toString()
	{
		return this.value + " => " + this.priority;
	}
}

public class PriorityQueueMain {

	public static void main(String[] args) {
		
		PriorityQueue<pairs> pq = new PriorityQueue<>((a,b) -> a.priority-b.priority);
		pq.add(new pairs("Ram" , 100));
		pq.add(new pairs("Modi" , 0));
		pq.add(new pairs("VK" , 1));
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);

	}

}

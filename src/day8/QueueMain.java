package day8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(45);
		queue.add(56);
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		if(queue.isEmpty())
			System.out.println("Queue is Empty");

	}

}

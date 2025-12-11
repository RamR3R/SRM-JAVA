package day8;

import java.util.Scanner;

class Node
{
	int value;
	Node next;
	
	Node(int val)
	{
		this.value = val;
		this.next = null;
	}
}

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node node1 = new Node();
//		node1.value = 500; //head
//		Node head = node1;
//		Node node2 = new Node();
//		node2.value = 600;
//		Node node3 = new Node();
//		node3.value = 700;
//		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = null; //tail
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no.of Nodes : ");
		int n = sc.nextInt();
		Node prev = null;
		Node head = null;
			for(int i = 0 ; i<n ; i++) // for creating a dynamic LL
			{
				int value = sc.nextInt();
				Node item = new Node(value);
				if(prev != null)
				{
					prev.next = item;
					prev = item;
				}
				else
				{
					head = item;
					prev = head;
				}
			}
			
		int val =  sc.nextInt();
		int pos = sc.nextInt();
		
		Node newNode = new Node(val);
		if(pos== 0)
		{
			newNode.next = head;
			head = newNode;
		}
		int count = 0;
		Node current = head;
		while(count < pos - 1 )
		{
			current = current.next;
			System.out.println(current.value);
			count++;
		}
		// current => 2
		newNode.next = current.next;
		current.next = newNode;
			
		// iterating a linked list
		current = head;
		while(current != null)
		{
			System.out.print(current.value + " => ");
			current = current.next;
		}
		
	}

}

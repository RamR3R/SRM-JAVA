package day5;

import java.util.Scanner;

class clac
{
	//method overloading
	int add(int x , int y)
	{
		return x + y;
	}
	
	int add(int x , int y , int z)
	{
		return x * y * z;
	}
	static int  mul(int x)
	{
		return x*x;
	}
		
}



class A
{
	void hai() {
		System.out.println("A");
	}
}
class B extends A
{
	void hai() {
		System.out.println("B");
	}
}
class C extends B
{
	void hai() {
		System.out.println("C");
	}
}

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clac obj = new clac();
		
		//Scanner class
		Scanner xyz = new Scanner(System.in);
		int x = xyz.nextInt();
		int y = xyz.nextInt();
		System.out.println(obj.add(x,y));
		String name = xyz.next(); // String
		System.out.println("Name : " + name);
		xyz.close();
	}
}



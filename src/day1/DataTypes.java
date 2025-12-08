package day1; // don't worry about this today

// key words are reserved words 

public class DataTypes {
	public static void main(String[] args) {
		// Data Types
//		int number1 = 100; //default type for numbers
//		long bigNumber = 19009090909l;
//		float number2 = 5.45f;
//		double bigFloat = 99.999999999999999; // default type of decimal
//		boolean present = true;
//		char favSymbol = '#';
		
		//operators
		//Arithmetic ops
		int x = 31;
		int y = 12;
		int answer = x + y;
		answer = x - y;
		answer = x / y;
		answer = x % y; //remainder of x / y
		
		// logical operators(True / False)
		// AND && , OR || , NOT !
		boolean a = true;
		boolean b = false;
		boolean bolAnswer = a && b;
		
		// bitwise operator & , | , ! , ^ (EXOR)
		int p = 5;
		int q = 3;
		int bitAnswer = 5 ^ 3;   
		// bit wise
		// number => binary first then perform op
		// 101
		// 011
		
		// Comparison operator ( used for conditions)
		int v = 250;
		// < , > , <= , >= , == , !=
				
		// Assignment operator
		// 
		
		int ramBlance = 100;
		ramBlance += 200; // => ramBlance = ramBlance + 200;
		ramBlance -= 100;
		ramBlance *= 2;
		ramBlance /= 3;
		
//		increment or decrement
		int i = 0;
		i++; // => i = i + 1; increment
//		i--; // => i = i - 1; decrement
		i++; //post increment
		++i; //pre increment
		System.out.println(++i); // print in the console
//		what is i? => i = 2
		
		
	}
}

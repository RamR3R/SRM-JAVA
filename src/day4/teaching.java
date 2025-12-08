package day4;


class Student
{
	String name;
	int rollno = 10;
	
	Student(String name , int rollno)
	{
		this.name = name;
		this.rollno = rollno;
//		System.out.println("constructor called");
	}
	
	void study()
	{
		System.out.println(this.name + " is Studying");
	}
	
	
}

public class teaching {
	
	public static void main(String[] args) {
		
		Student person1 = new Student("Ram" , 96);
		Student person2 = new Student("Sam" , 97);
		Student person3 = new Student("Jam" , 98);
		
		person1.study();
		System.out.println();

	}

}

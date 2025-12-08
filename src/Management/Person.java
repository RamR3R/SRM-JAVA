package Management;

class Person {
	String name;
	String gender;
	long mobile;
	
	Person(String name , String gender , long mobile)
	{
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
	}
}


class Student extends Person
{
	int regNo;
	String dept;
	int yop;
	
	Student(String name , String gender, long mobile , int regno , String dept, int yop)
	{
		super(name, gender, mobile);
		this.regNo = regno;
		this.dept = dept;
		this.yop = yop;
	}
}


class Staff extends Person
{
	int staffId;
	int yoj;
	double salary;
	
	Staff(String name , String gender, long mobile , int staffId , int yoj, double salary)
	{
		super(name , gender , mobile);
		this.staffId = staffId;
		this.yoj = yoj;
		this.salary = salary;
	}
}



class Teaching extends Staff
{
	String subject;
	
	Teaching(String name , String gender, long mobile , int staffId , int yoj, double salary , String subject)
	{
		super(name,gender,mobile,staffId , yoj , salary);
		this.subject = subject;
	}
}

class NonTeaching extends Staff
{
	String department;
	
	NonTeaching(String name , String gender, long mobile , int staffId , int yoj, double salary , String department)
	{
		super(name,gender,mobile,staffId , yoj , salary);
		this.department = department;
	}
}







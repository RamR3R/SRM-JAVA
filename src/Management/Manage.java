package Management;

import java.util.Scanner;

public class Manage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] studentData = new Student[100];
		Teaching[] teachers = new Teaching[100];
		NonTeaching[] nonTeaching = new NonTeaching[100];
		int studentCount = 0;
		int teachingCount = 0;
		int nonTeachingCount = 0;
		
		while(true)
		{
			System.out.println("| Management Console |");
			System.out.println("1. Add people \n2. View");
			System.out.println("Enter ur choice : ");
			
			int choice  = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.println("| Add People |");
				System.out.println("1. Student \n2. Teaching Staff \n3.NonTeaching Staff");
				System.out.println("Enter ur choice : ");
				int addChoice  = sc.nextInt();
				
				switch(addChoice)
				{
				case 1:
					String name = sc.next();
					String gender = sc.next();
					long mobile = sc.nextLong();
					int regno = sc.nextInt();
					String dept = sc.next();
					int yop = sc.nextInt();
					
					Student obj = new Student(name,gender,mobile,regno,dept,yop);
					studentData[studentCount++] = obj;
					break;
				case 2:
					String name1 = sc.next();
					String gender1 = sc.next();
					long mobile1 = sc.nextLong();
					int staffId = sc.nextInt();
					int yoj = sc.nextInt();
					double salary = sc.nextInt();
					String subject = sc.next();
					
					Teaching teacherObj = new Teaching(name1,gender1,mobile1,staffId,yoj,salary,subject);
					teachers[teachingCount++] = teacherObj;
					break;
					
				}
				
				
			}
			
			else
			{
				System.out.println("| View console |");
				System.out.println("1. Students \n2. Teachers \n3. NonTeaching");
				int viewChoice = sc.nextInt();
				
				switch(viewChoice)
				{
				case 1:
					for(int i = 0 ; i< studentData.length ; i++)
						System.out.println(studentData[i].name);
					break;
				case 2:
					for(int i = 0 ; i< teachers.length ; i++)
						System.out.println(teachers[i].name);
					break;
				case 3:
					for(int i = 0 ; i< nonTeaching.length ; i++)
						System.out.println(nonTeaching[i].name);
					break;
					
				}
			}
		}
		
		

		


	}
}

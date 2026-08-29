package inheritancePrograms;

import java.util.Scanner;

public class Qsn06 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		int id=sc.nextInt();
		System.out.println("enter the marks: ");
		int marks =sc.nextInt();
		System.out.println("enter the attendance: ");
		int attendance=sc.nextInt();
		Result r=new Result(name,id,marks,attendance);
		r.displayDetails();
		System.out.println("Grade: "+r.calculateGrade());
		System.out.println("Result is: "+r.calculateResut());
	}

}
class Student02
{
	public String name;
	public int id;
	public Student02(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("id : "+id);
	}
	
}
class Marks extends Student02
{
	public int marks;

	public Marks(String name, int id, int marks) {
		super(name, id);
		this.marks = marks;
	}
	public char calculateGrade()
	{
		if(marks>=80)
		{
			return 'A';
		}
		else if (marks>=60)
		{
			return 'B';
		}
		else 
		{
			return 'C';
		}
	}
}
class Result extends Marks
{
	public int attendance;

	public Result(String name, int id, int marks, int attendance) {
		super(name, id, marks);
		this.attendance = attendance;
	}
	public String calculateResut()
	{
		if (attendance>=75)
		{
			return "PASS";
		}
		else 
		{
			return "FAIL";
		}
	}
}

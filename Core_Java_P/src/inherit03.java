import java.util.Scanner;

public class inherit03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the name : ");
		String name=sc.nextLine();
		StudentDetails s=new StudentDetails(name);
		s.displayParentName();
	}
}
class Student 
{
	public String name;

	public Student(String name) {
		super();
		this.name = name;
	}
}
class StudentDetails extends Student
{

	
	public StudentDetails(String name) {
		super(name);
	}

	void displayParentName()
	{
		System.out.println("Parent Name: "+super.name);
	}
}

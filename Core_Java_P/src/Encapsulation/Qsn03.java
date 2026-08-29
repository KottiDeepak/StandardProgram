package Encapsulation;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Student id,name,marks: ");
		int studentId=sc.nextInt();
		sc.nextLine();
		String studentName=sc.nextLine();
		int marks=sc.nextInt();
		int newMarks=sc.nextInt();
		ExamPortal e=new ExamPortal(studentId,studentName,marks);
		e.setMarks(newMarks);
		System.out.println("Marks : "+e.getMarks());
		
		
	}

}
class StudentAccount
{
	private int studentId;
	private String studentName;
	private int marks;
	
	public StudentAccount(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int newMarks) {
		if(newMarks>=0&&newMarks<=100)
		{
			this.marks = newMarks;
			System.out.println("marks updated successfully..");
			
		}
		else {
			System.out.println("Invalid marks:");
		}
	}
	public void displayDetails()
	{
		System.out.println("id :"+studentId);
		System.out.println("Name: "+studentName);
		System.out.println("Marks : "+marks);
	}
}
class ExamPortal extends StudentAccount
{
	public ExamPortal(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}

	public void setMarks(int newMarks)
	{
		if(newMarks>100)
		{
			System.out.println("Marks cannot Exceed 100.");
		}
		else
		{
			super.setMarks(newMarks);
		}
	}
}

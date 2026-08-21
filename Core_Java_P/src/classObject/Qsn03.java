package classObject;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		System.out.println("enter all the three marks one by one :");
		int marks1=sc.nextInt();
		int marks2=sc.nextInt();
		int marks3=sc.nextInt();
		Student02 ob=new Student02(name,marks1,marks2,marks3);
		ob.displayResult();
	}

}

class Student02 {
	// step 01 declare all the static and non-static variable
	public String name;
	public int marks1;
	public int marks2;
	public int marks3;

	// initialize non static variable with help of constructor
	public Student02(String name, int marks1, int marks2, int marks3) {
		super();
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	// step 03 write any methods if any required
	public int calculateTotal() {
		return marks1 + marks2 + marks3;
	}
	public double calculateAverage()
	{
		return (calculateTotal()/3.0);
	}
	public void displayResult()
	{
		System.out.println("Name : "+name);
		System.out.println("sub-01: "+marks1);
		System.out.println("sub-02: "+marks2);
		System.out.println("sub-03: "+marks3);
		System.out.println("Total: "+calculateTotal());
		System.out.println("Average : "+calculateAverage());
	}

}
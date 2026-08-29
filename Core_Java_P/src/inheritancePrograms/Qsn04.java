package inheritancePrograms;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name and age.: ");
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		double  salary=sc.nextDouble();
		double  bonus=sc.nextDouble();
		
		Manager m=new Manager(name,age,salary,bonus);
		m.displayDetails();
	}

}
class person{
	public String name;
	public int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		
	}
}
class Employee extends person
{
	public double  salary;

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		
	}
}
class Manager extends Employee
{
	public double bonus;
	public Manager(String name, int age, double salary,double bonus) {
		super(name, age, salary);
		this.bonus=bonus;
		
	}
	public void displayDetails()
	{
		super.displayDetails();
		double totalSal=salary+bonus;
		System.out.println("Bonus is : "+bonus);
		System.out.println("Total Salary is: "+totalSal);
	}
	
	
}


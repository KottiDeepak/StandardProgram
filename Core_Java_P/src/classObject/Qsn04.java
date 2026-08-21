package classObject;

import java.util.Scanner;

public class Qsn04 {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		String name=sc.nextLine();
		System.out.println("enter basice Salary: ");
		double basicSalary=sc.nextDouble();
		Employee e=new Employee(name,basicSalary);
		e.display();
	}
}
class Employee
{
	public String name;
	public double basicSalary;
	public Employee(String name, double basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public double hra()
	{
		double p= (basicSalary*10)/100;
		return p;
	}
	public double da()
	{
		double a=(basicSalary*20)/100;
		return a;
	}
	public double calculateTotal()
	{
		return hra()+da()+basicSalary;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Hra : "+hra());
		System.out.println("Da :"+da());
		System.out.println("Total Salary : "+calculateTotal());
	}
}


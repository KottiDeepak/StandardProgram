package inheritancePrograms;

import java.util.Scanner;

public class Qsn03 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name , id, salary and bonus: ");
		String name=sc.nextLine();
		int id=sc.nextInt();
		double salary=sc.nextDouble();
		double bonus=sc.nextDouble();
		BonusEmployee b=new BonusEmployee(name,id,salary, bonus);
		b.displayDetails();
		//System.out.println("Total salary is : "+b.calculateSalary());
		}
}
class employee
{
	public String name;
	public int id;
	public double salary;
	public employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("final salary : "+calculateSalary());
		
		
	}
	public double calculateSalary()
	{
		return salary;
	}
}
class  BonusEmployee extends employee
{
	public double bonus;

	public BonusEmployee(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	public void displayDetails()
	{
		super.displayDetails();
		//System.out.println("Bonus : "+bonus);
		
		
	}
	public double calculateSalary()
	{
		System.out.println("Basic salary: "+super.calculateSalary());
		System.out.println("Bonus : "+bonus);
		return super.calculateSalary()+bonus;
		
		
	}
	
	
}

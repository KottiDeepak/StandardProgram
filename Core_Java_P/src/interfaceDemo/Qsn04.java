package interfaceDemo;

import java.util.Scanner;

public class Qsn04 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Your choice");
		int choice=sc.nextInt();
		System.out.println("enter your salary");
		double salary=sc.nextDouble();
		Employee emp=FactoryClass.getImplementationObject(choice);
		System.out.println("Bonus : "+emp.calculateBonus(salary));
		
	}
}
abstract class Employee{
	public abstract double calculateBonus(double salary);

}
class FactoryClass
{
	public static Employee getImplementationObject(int choice)
	{
		Employee emp=null;
		switch(choice)
		{
		case 1: emp=new PermanentEmployee();
		case 2: emp =new ContractEmployee();
		}
		return emp;
	}
}
class PermanentEmployee extends Employee
{
	public double calculateBonus(double salary) {
		return salary*0.01;
	}
	
}
 class ContractEmployee extends Employee
 {
	public double calculateBonus(double salary) {
		
		return salary*0.05;
	}
	
}
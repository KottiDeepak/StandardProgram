package Encapsulation;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empid ,name and salary: one by one : ");
		int empId=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		double salary=sc.nextDouble();
		double newSalary=sc.nextDouble();
		
		HRDepartment hr=new HRDepartment(empId,name,salary);
		hr.setSalary(newSalary);
		System.out.println("Salary : "+hr.getSalary()); 
		
		
		
	}

}
class Employee
{
	public int empId;
	public String empName;
	private double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0)
		{
			System.out.println("Invalid salary");
		}
		else
		{
			this.salary=salary;
			System.out.println("Salary updated Successfully..");

		}
	}
	public void displayDetails()
	{
		System.out.println("Employee id: "+empId);
		System.out.println("employee name: "+empName);
		System.out.println("Salary : "+salary);
	}
	
}
class HRDepartment extends Employee
{

	public HRDepartment(int empId, String empName, double salary) {
		super(empId, empName, salary);
		
	}
	public void setSalary(double salary)
	{
		if (salary>1.5*getSalary())
		{
			System.out.println("Increment Limit Exceeded.");
		}
		else 
		{
			super.setSalary(salary);

			
		}
	}
	
}

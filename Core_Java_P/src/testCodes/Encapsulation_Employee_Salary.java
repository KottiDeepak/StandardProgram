package testCodes;

import java.util.Scanner;

public class Encapsulation_Employee_Salary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);=-
		System.out.println("enter the id :");
		int employeeId=sc.nextInt();
		System.out.println("enter the name :");
		sc.nextLine();
		String employeeName=sc.nextLine();
		System.out.println("enter the salary: ");  
		double salary=sc.nextDouble();
		System.out.println("enter the increasing percentage: ");
		double percentage=sc.nextDouble();
		Employee e=new Employee();
		e.setEmployeeId(employeeId);
		e.setEmployeeName(employeeName);
		e.setSalary(salary);
		e.increaseSalary(percentage);
		
		
		System.out.println("employee id: "+e.getEmployeeId());;
		System.out.println("employee name: "+e.getEmployeeName());
		System.out.println("salary: "+e.getSalary());
	}
}
class Employee
{
	private int employeeId;
	private String employeeName;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void increaseSalary(double percentage)
	{
		double Iamount;
	
		Iamount=(salary*percentage)/100;
	salary =salary+Iamount;
		//salary=newAmount;
	}
	public void setSalary(double salary)
	{
		if (salary<0)
		{
			this.salary=0;
		}
		else 
		{
			this.salary=salary;
			}
	}
}


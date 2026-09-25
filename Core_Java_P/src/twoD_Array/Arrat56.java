package twoD_Array;

import java.util.Scanner;

public class Arrat56 {
	static Employee [] a;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employees: ");
		int n=sc.nextInt();
		a =new Employee[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Employee Id, employee name, deptartment,salary");
			int empid=sc.nextInt();
			sc.nextLine();
			String empName=sc.nextLine();
			String dept=sc.nextLine();
			double salary=sc.nextDouble();
			
			a[i]=new Employee(empid,empName,dept,salary);
			sc.nextLine();
		}
//		for( Employee e:a)
//		{
//			e.displayDetails();
//		}
		System.out.println("=================================================");
		System.out.println("Enter 1 for printing the deteails of employees belong to the  given dept");
		System.out.println("Enter 2 for printing the details of employees who are having salary greater than the given salary");;
		System.out.println("Enter 3 for average salary");
		System.out.println("=================================================");
		System.out.println("enter your choice : ");
		int choice =sc.nextInt();
		switch(choice)
		{
			case 1->
			{
				sc.nextLine();
				System.out.println("Enter the department name :  ");
				String dept=sc.nextLine();
				empBelongToGivenDept(dept);
			}
			case 2->
			{
				System.out.println("Enter the target salary : ");
				double salary =sc.nextDouble();
				empGreaterThanGivenSalary(salary);
			}
			case 3->
			{
				empAvgSalary();
			}
			default-> System.out.println("invalid choice: ");
		}
	}
	public static void empBelongToGivenDept(String dept)
	{
		for(Employee e:a)
		{
			if(e.dept.equalsIgnoreCase(dept))
			{
				e.displayDetails();
			}
		}
	}
	public static void empGreaterThanGivenSalary(double salary)
	{
		for(Employee e:a)
		{
			if(e.salary>salary)
			{
				e.displayDetails();			
			}
		}
	}
	public static void empAvgSalary()
	{
		double sum=0;
		for(Employee e:a)
		{
			sum+=e.salary;
		}
		System.out.println("Average salary: "+sum/a.length);
	}
}
class Employee
{
	public int empId;
	public String empName;
	public String dept;
	public double salary;
	public Employee(int empId, String empName, String dept, double salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Department  : "+dept);
		System.out.println("Employee Salary : "+salary);
	}	
}

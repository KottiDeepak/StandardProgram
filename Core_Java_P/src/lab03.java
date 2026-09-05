
import java.util.Scanner;

public class lab03 
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	      System.out.println("enter : ");
	      String empname=sc.nextLine();
	      int salary=sc.nextInt();
	      Bonus b=new Bonus(empname,salary);
	     System.out.println("Bonus: "+b.display());
	      

	}
}
class Employee 
{
	String empname;
	int salary;
	public Employee(String empname, int salary) {
		super();
		this.empname = empname;
		this.salary = salary;
	}
}
class Bonus extends Employee
{4

	public Bonus(String empname, int salary) {
		super(empname, salary);

	}
	int display()
	{
		if(salary>=30000)
		{
			return salary=((salary*10)/100);
		}
		else
		{
			return 0;
		}
	}
}

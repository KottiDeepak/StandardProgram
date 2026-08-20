package MethodAndVariables;
import java.util.Scanner;
public class Methoddemo34 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the marks: ");
		int mark=sc.nextInt();
		Methoddemo34 ob=new Methoddemo34();
		ob.printResult(mark);
		
	
	}
	  void printResult(int mark)
	{
		int m=mark;
		if(m>=35)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}

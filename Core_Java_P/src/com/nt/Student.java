package com.nt;
import java.util.Scanner;
public class Student 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Your name: ");
		String name=sc.nextLine();
		System.out.println("enter all 3 marks one by one : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total= a+b+c;
		double avg= (a+b+c)/3;
		if((a>0&&a<100)||(b>0&&b<100)||(c>0&&c<100))
		{
			System.out.println("Total = "+total);
			System.out.printf("Average = %.1f\n",avg);
			if(avg>=35)
			{
				System.out.println("Result = Pass");
			}
			else 
			{
				System.out.println("Result = Fail");
			}
		}
		else 
		{
			System.out.println("Invalid Input");
		}
	}

}

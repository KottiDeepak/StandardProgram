package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo25 {
	public static int number()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		return n;
	}
	public static void main(String args[])
	{
		if(number()>0)
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}
}

package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo22 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		square(n);
	}
	public static void square(int a)
	{
		System.out.println(a*a);
	}

}

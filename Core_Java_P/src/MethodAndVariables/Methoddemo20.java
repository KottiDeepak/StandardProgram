package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo20 {
	public static void multi(int a)
	{
		for (int i =1;i<=10;i++)
		{
			int b=i*a;
			System.out.print(" "+b+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		multi(a);
	}

}

package MethodAndVariables;

import java.util.Scanner;

public class MethodDemo29 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number one by one: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		MethodDemo29 ob=new MethodDemo29();
		int product=ob.multiply(a,b);
		System.out.println(product);
	}
	int multiply(int a , int b)
	{
		return a*b;
	}
	

}

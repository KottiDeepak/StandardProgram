package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo24 {
	public static void main(String[] args) {
		System.out.println(sum());
	}
	public static int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number one by one ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		return sum; 
		
	}

}

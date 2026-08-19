package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo23 {
	public static void main(String args[])
	{
		System.out.println(getInteger());
		
	}
	public static int getInteger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		return n;
	}

}

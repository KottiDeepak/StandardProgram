package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo35 {
	public static void main(String args[])
	{
	
		System.out.println( new Methoddemo35().userAge());
		
	}
	int userAge()
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		return age;
	}

}

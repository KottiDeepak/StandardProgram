package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo28 {
	public static void main(String args[])
	{
		evenNumber();
	}
	public static void evenNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
	}

}

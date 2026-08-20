package MethodAndVariables;

import java.util.Scanner;

public class MethodDemo31 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers one by one: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		MethodDemo31 ob=new MethodDemo31();
		System.out.println(ob.min(a,b,c));
		
	}
	int min(int a,int b,int c)
	{
		int smaller=(a<b&&a<c)?a:(b<c)?b:c;
		return smaller;
	}

}

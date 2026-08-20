package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo36 {
	boolean printEven()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Methoddemo36 ob=new Methoddemo36();
		
		System.out.println(ob.printEven());
	}

}

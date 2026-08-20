package MethodAndVariables;

import java.util.Scanner;

public class MethodDemo30 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		MethodDemo30 ob=new MethodDemo30();
		System.out.println(ob.isPalindrome(n));
		
		
	}
	boolean isPalindrome(int num)
	{
		
		int rev=0;
		int t=num;
		while(t!=0)
		{
			int ld=t%10;
			rev=rev*10+ld;
			t=t/10;
		}
		if(rev==num)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}

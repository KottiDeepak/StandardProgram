package MethodAndVeriables;

import java.util.Scanner;

public class MethodDemo32 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		MethodDemo32 ob=new MethodDemo32();
		ob.reverse(n);
		
	}
	void reverse(int num)
	{
		int rev=0;
		int t=num;
		while(t!=0)
		{
			int ld=t%10;
			rev=rev*10+ld;
			t=t/10;
		}
		System.out.println(rev);
	}

}

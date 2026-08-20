package MethodAndVeriables;

import java.util.Scanner;

public class Methoddemo33 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int n=sc.nextInt();
		Methoddemo33 ob=new Methoddemo33();
		ob.character(c, n);
	}
	void  character(char c,int n)
	{
		for (int i =1;i<=n;i++)
		{
			System.out.print(c);
		}
	}

}

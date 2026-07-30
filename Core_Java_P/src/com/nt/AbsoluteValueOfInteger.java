package com.nt;
import java.util.Scanner;
public class AbsoluteValueOfInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		if(num<0)
		{
			num=num*-1;
		}
		System.out.println("absolute value is : "+num);
	}
}

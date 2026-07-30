package com.nt;

import java.util.Scanner;

public class MaxOfTwo  
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers one by one : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1);
			return;
		}
		System.out.println(n2);
	}
}

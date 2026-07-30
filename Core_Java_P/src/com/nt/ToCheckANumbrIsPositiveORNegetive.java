package com.nt;
import java.util.Scanner;
public class ToCheckANumbrIsPositiveORNegetive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		if (n>0)
		{
			System.out.println("positive number");
		}
		else if (n<0)
		{
			System.out.println("negetive number");
		}
		else 
		{
			System.out.println("nutral number");
		}
	}
}

package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo27 {
	public static void main(String[] args) {
		printStar();
	}
	public static void printStar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.print(" * ");
		}
		
	}

}

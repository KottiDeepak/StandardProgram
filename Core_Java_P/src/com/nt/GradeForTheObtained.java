package com.nt;

import java.util.Scanner;

public class GradeForTheObtained {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark: ");
		int m=sc.nextInt();
		if(m>=90&&m<=100)
		{
			System.out.println("Grade is : A+");
		}
		else if(m>=80&&m<=89)
		{
			System.out.println("Grade is : A");
		}
		else if(m>=70&&m<=79)
		{
			System.out.println("Grade is : B");
		}
		else if(m>=60&&m<=69)
		{
			System.out.println("Grade is : C");
		}
		else if(m>=50&&m<=59)
		{
			System.out.println("Grade is : D");
		}
		else if(m>=35&&m<=49)
		{
			System.out.println("Grade is : E");
		}
		else if(m>=0&&m<=34)
		{
			System.out.println("Grade is : F");
		}
		else 
		{
			System.out.println("Invalid marks");
		}
	}
}

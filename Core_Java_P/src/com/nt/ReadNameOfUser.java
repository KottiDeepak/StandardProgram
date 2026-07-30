package com.nt;
import java.util.Scanner;
public class ReadNameOfUser
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name : ");
		String name =sc.next();
		System.out.println("Given Name is : "+name);
	}
}

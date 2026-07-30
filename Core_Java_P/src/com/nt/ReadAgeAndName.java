package com.nt;
import java.util.Scanner;
public class ReadAgeAndName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your name : ");
		String name =sc.nextLine();
		System.out.println("age is : "+age);
		System.out.println("name is : "+name);
	}

}
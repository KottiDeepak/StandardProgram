package com.nt;
import java.util.Scanner;
public class ReadUserAgeAndGreatPleaseWelcome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age : ");
		int age=sc.nextInt();
		if(age<25)
		{
			System.out.println("'Hey Young Man,");
		}
		System.out.println("  please Welcome!!..");
	}
}

package com.nt;

import java.util.Scanner;

public class VotingEligibility01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name : ");
		String name =sc.nextLine();
		System.out.println("enter your age : ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible for voting!!");
			return;
		}
		System.out.println("You are not eligible for voting!!");
	}
}

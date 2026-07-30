package com.nt;
import java.util.Scanner;
public class ToCheckAPersonEligibleForVotingOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age =sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible!!..");
		}
		else
		{
			System.out.println("you are not eligible for voting!!..");
		}
	}

}

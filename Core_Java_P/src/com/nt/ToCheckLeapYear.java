/*8. Check Whether a Year is a Leap
Year (Basic Version)
Problem Statement
Write a Java program to determine whether a year is divisible by 4.
Example:
int year = 2028;
Output:
Leap Year*/package com.nt;

public class ToCheckLeapYear {
	public static void main(String[] args) {
		int year=2028;
		String leap=(year%4==0)? "It is a leap year":"It is not a leap year";
		System.out.println(leap);
	}
}

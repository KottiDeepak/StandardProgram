/*4. Check Whether a Number is
Positive or Negative
Problem Statement
Write a Java program to determine whether a number is positive or
negative.

Core java by Mahendra Sir

Example:
int number = -15;
Output:
Negative Number*/
package com.nt;

public class FindPositiveOrNegetive {
	public static void main(String[] args) {
		int number=15;
		String result=(number>0)? "Positive Number": "Negetive Number";
		System.out.println("the Number is :"+result);
	}
}

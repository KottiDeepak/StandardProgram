/*5. Find the Smallest of Two Numbers
Problem Statement
Write a Java program to find the smallest among two integers.
Example:
int a = 90;
int b = 35;
Output:
Smallest Number = 35*/
package com.nt;

public class SmalletAmongTwo {
	public static void main(String[] args) {
		int a=90;
		int b=45;
		int smallest = (a<b)? a:b;
		System.out.println("Smalles is :"+smallest);
		
		
	}

}

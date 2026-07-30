/*2. Check Whether a Number is Even
or Odd
Problem Statement
Write a Java program to check whether a given integer is even or odd.
Example:
int number = 17;
Output:
Odd Number
*/
package com.nt;
import java.util.Scanner;
public class OddEvenCheck {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a Number to check : ");
	   int n=sc.nextInt();
	   String result= (n%2==0)?"even number ":"odd number ";
		   System.out.println(result);
	}

}

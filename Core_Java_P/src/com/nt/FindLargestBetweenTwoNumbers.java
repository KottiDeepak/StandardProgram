/*1. Find the Largest of Two Numbers
Problem Statement
Write a Java program to find the largest among two integers.
Assign the values directly inside the program.
Example:
int a = 25;
int b = 40;
Print:
Largest Number = 40*/
package com.nt;
import java.util.*;
public class FindLargestBetweenTwoNumbers {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number 1: ");
	 int n1=sc.nextInt();
	 System.out.println("enter number 2: ");
	 int n2=sc.nextInt();
	 int largest = (n1>n2)? n1:n2;
	 System.out.println("larges value is "+largest);
	 
 	}
 
}

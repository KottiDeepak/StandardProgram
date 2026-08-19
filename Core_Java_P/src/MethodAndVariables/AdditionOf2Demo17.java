/*Write a Java program where you define a static method addNumbers(int a, int b)
The method should take two numbers as arguments and return their sum.
Test Case 1
Input: 5 10
Output: 15
Test Case 2
Input: -3 7
Output: 4
Test Case 3
Input: 0 8
Output: 8*/
package MethodAndVariables;

import java.util.Scanner;

public class AdditionOf2Demo17 {
     public static int add(int a,int b)
     {
    	return a+b;
     }
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the value for a ");
    	 int a=sc.nextInt();
    	 System.out.println("enter the value for b ");
    	 int b=sc.nextInt();
    	 int sum=add(a,b);
    	 System.out.println(sum);
    	 
     }
}

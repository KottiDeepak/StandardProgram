/*Create a static method checkGreater(int a, int b)
The method should take two numbers and return the greater number.
Test Case 1
Input: 10 20
Output: 20
Test Case 2
Input: 50 25
Output: 50
Test Case 3
Input: 7 7
Output: 7*/
package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo19 {
	public static int greater(int a, int b)
	{
		return (a>=b)?a:b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number to find greator one: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int greater=greater(a,b);
		System.out.println("the greater is : "+greater);
	}

}

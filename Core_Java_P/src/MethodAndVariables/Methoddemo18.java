/*Create a static method findArea(int radius)
The method should take radius as argument and return the area of a circle.
Test Case 1
Input: 7
Output: 153.86
Test Case 2
Input: 1
Output: 3.14
Test Case 3
Input: 0
Output: 0.0*/
package MethodAndVariables;

import java.util.Scanner;

public class Methoddemo18 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of a circle : ");
		double r=sc.nextInt();
		System.out.println(+radius(r));
		
	}
	public static double radius(double r)
	{
	 return 3.14*r*r;

	}

}

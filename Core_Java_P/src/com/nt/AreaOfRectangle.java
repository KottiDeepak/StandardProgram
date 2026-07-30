package com.nt;
import java.util.Scanner; 
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth of a rectangle one by one : ");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		double area = length*breadth;
		System.out.println("area of Rectangle is : "+area);
		System.out.printf("area of Rectangle is: %.2f",area);	
	}
}

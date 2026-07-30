package com.nt;
 import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		double p=sc.nextDouble();
		System.out.println("Enter the rate of interest : ");
		double r=sc.nextDouble();
		System.out.println("Enter the time period(in years): ");
		double t=sc.nextDouble();
		double SimpleInterest=(p*t*r)/100;//this formula only for to calculate the interest in years only .
		System.out.println("The interest is : "+SimpleInterest);
	}
}

package com.nt;
import java.util.Scanner;
public class ConditionalOperator {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number a: ");
	 System.out.println("enter the number b: ");
	 System.out.println("enter the number c: ");
	 System.out.println("enter the number d: ");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 int d=sc.nextInt();
	 int largest=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
	 System.out.println("largest value is :"+largest);
	
}
}

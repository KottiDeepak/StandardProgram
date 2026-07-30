package com.nt;
import java.util.Scanner;
public class AverageOf3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the three number one by one : ");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	double avg=(n1+n2+n3)/3.0;
	System.out.println("average of there number is : "+avg); //standard method in this we can get value like: 9.666666666666666.
	System.out.printf("average of three number is : %.2f",avg);//when the double type of the value you want to print you should write instead of using system.out.println() we will use system.out.printf(); and instead of Using + for variable instead of this in this case we use the , (comma).
	}
}

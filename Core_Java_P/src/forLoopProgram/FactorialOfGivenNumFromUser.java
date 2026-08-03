package forLoopProgram;

import java.util.Scanner;

public class FactorialOfGivenNumFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		long num=sc.nextInt();
		long fact=1;
		for (long i=num;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("factorial of "+num+" is : "+fact);
	}
}

package forLoopProgram;

import java.util.Scanner;

public class NumInTheGivenRangeReadMinandMaxFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter min number: ");
		int n1=sc.nextInt();
		System.out.println("Enter max number : ");
		int n2=sc.nextInt();
		for (int i=n1;i<=n2;i++)
		{
			System.out.println(i);
		}
	}
}

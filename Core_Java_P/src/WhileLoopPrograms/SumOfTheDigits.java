package WhileLoopPrograms;

import java.util.Scanner;

public class SumOfTheDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the number : ");
		int n=sc.nextInt();
		int sum=0;
		int ld;
		while(n!=0)
		{
			ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println(sum);
	}
}

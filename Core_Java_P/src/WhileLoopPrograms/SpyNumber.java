//write a java program to print 
package WhileLoopPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while(n!=0)
		{
			int ld=n%10;
			sum=sum+ld;
			product=product*ld;
			n=n/10;
		}
		if(sum==product)
		{
			System.out.println("Spy number");
		}
		else 
		{
			System.out.println("not a Spy number ");
		}
	}

}

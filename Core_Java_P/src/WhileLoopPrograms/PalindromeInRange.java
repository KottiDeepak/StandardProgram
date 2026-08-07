package WhileLoopPrograms;

import java.util.Scanner;

public class PalindromeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the min value : ");
		int min=sc.nextInt();
		System.out.println("enter the max value : ");
		int max=sc.nextInt();
		for(int n=min;n<=max;n++)
		{
			int temp =n;
			int rev=0;
			while(temp!=0)
			{
				int ld=temp%10;
				rev=rev*10+ld;
				temp=temp/10;
			}
			if(rev==n)
			{
				System.out.println(rev);
			}
		}
	}
}

// HCF of the given two numbers 
package WhileLoopPrograms;

import java.util.Scanner;

public class HCFOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers one by one :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i>=1;i--)// here we can take a common number from both n1 and n2 the value in the for loop like for (int i=n2;i<=1;i--). 
		{
			if(n1%i==0&&n2%i==0)
			{
				System.out.println("HCF is : "+i);
				break;
			}
		}
		
		
	}
}

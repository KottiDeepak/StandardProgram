// lcm of the given two numbers.
package WhileLoopPrograms;

import java.util.Scanner;

public class LCMOFGivenTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers one by one  : ");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		for(int i=1;true;i++)
		{
			if((num*i)%num1==0)
			{
				System.out.println("LCM is : "+(num*i));
				break;
			}
		}
		
		
	}
}

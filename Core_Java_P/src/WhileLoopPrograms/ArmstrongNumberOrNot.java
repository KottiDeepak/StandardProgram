package WhileLoopPrograms;

import java.util.Scanner;

public class ArmstrongNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		// step 1 : count he number of digits using temp.
		int count=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		//step 2 : find the sum of the digits with power of count.w
		double sum=0;
		while (temp!=0)
		{
			// step-2.1 : take ld from temp.
			int ld=temp%10;
			//steo 2.2 : find ld to the power count.
			double power=Math.pow(ld, count);
			// step 2.3 : add power to sum
			sum=sum+power;
			//step 2.4 : remove ld from temp.
			temp=temp/10;
		}
		// step 3 : check the sum and original equal or not if equal then print the if block else else block.
		if(sum==num)
		{
			System.out.println("Armstrong number");
		}
		else 
		{
			System.out.println("not Armstrong number");
		}
	}
}

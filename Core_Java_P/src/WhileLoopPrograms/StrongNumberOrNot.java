package WhileLoopPrograms;

import java.util.Scanner;

public class StrongNumberOrNot {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		long sum=0;
		
		while (temp!=0)
		{
			int ld=temp%10;
			long fact=1;
			for (long i=ld;i>=1;i--)
			{
				fact*=i;
			}

			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("Strong number");
		}
		else 
		{
			System.out.println("not a strong number");
		}
		
	
	}
}

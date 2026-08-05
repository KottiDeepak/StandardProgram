package WhileLoopPrograms;

import java.util.Scanner;

public class GivenIsDuckNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int product=1;
		while(n!=0)
		{
			int ld=n%10;
			product= product*ld;
			n=n/10;
		}
		if(product==0)
		{
			System.out.println("Duck Number");
		}
		else 
		{
			System.out.println("not a duck number");
		}
	}
}

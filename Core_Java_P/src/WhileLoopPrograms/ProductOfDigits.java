//write a program to print product (product means multiplication) of the digits.
package WhileLoopPrograms;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int product=1;
		while (n!=0)
		{
			int ld=n%10;
			product=product*ld;
			n=n/10;
		}
		System.out.println("product of digits is : "+product);
	}
}

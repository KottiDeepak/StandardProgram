package arrayPrograms;

import java.util.Scanner;

public class Array32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the value one by one :");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int maxSum=Integer.MIN_VALUE;
		System.out.println("Sub arrays is ");
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<=a.length-1;j++)
			{
				int sum=0;
				System.out.print(a[i]+","+a[j]+"= ");
				for(int m=i;m<=j;m++)
				{
					System.out.print(a[m]+" ");
					sum+=a[m];
				}
				System.out.println("sum = "+sum);
				if(sum>maxSum)
				{
					maxSum=sum;
				}
			}
			
		}
		System.out.println("Max sub-array sum : "+maxSum);
	}
}

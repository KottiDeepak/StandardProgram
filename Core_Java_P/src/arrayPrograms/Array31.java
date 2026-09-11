//write a program to find the sum of a sub-arrays.
package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array31 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the value one by one :");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sub arrays is ");
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<=a.length-1;j++)
			{
				System.out.print("["+a[i]+" , "+a[j]+"] ");
				for(int m=i;m<=j;m++)
				{
				System.out.print(a[m]+" ");
				}
				System.out.println();
			}
		}
	}

}

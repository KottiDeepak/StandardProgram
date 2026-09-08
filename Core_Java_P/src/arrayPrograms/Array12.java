package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array12 {
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
		int b[]=new int [a.length];
		for (int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("copied array "+Arrays.toString(b));

	}
}

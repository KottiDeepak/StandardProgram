package arrayPrograms;

import java.util.Scanner;

public class Array04 {
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
		int largest =a[0];
		for (int e:a)
		{
			if (e>largest)
			{
				largest =e;
			}
		}
		System.out.println("the largest element is "+largest);
		
		
		
	}

}

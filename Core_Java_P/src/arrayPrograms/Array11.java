package arrayPrograms;

import java.util.Scanner;

public class Array11 {
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
			System.out.println("enter the element to search");
			int target =sc.nextInt();
			int count =0;
			for (int e:a)
			{
				if (e==target)
				{
					
					count++;
				}
			}
				System.out.println(target+" appeared "+count+" times");	
		}
	}


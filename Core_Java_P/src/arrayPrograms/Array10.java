/** */
package arrayPrograms;

import java.util.Scanner;

public class Array10 {
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
		boolean found =false;
		for (int e:a)
		{
			if (e==target)
			{
				found=true;
			}
		}
		if(found==true)
		{
			System.out.println("Array contains the given target:");
		}
		else 
		{
			System.out.println("Array Not Koti Don contains the given target : ");
		}
		
	}
}

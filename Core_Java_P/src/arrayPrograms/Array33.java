package arrayPrograms;

import java.util.Scanner;

public class Array33 {
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
		System.out.println("enter target-sum");
		int target=sc.nextInt();
		boolean result =false;
		int min=0;
		int max=0;
		System.out.println("Sub arrays is ");
		outer :
		for (int i=0;i<a.length;i++)
		{
			inner : 
			for (int j=i;j<=a.length-1;j++)
			{
				int sum=0;
				for(int m=i;m<=j;m++)
				{
					sum+=a[m];
				}
				if(sum==target)
				{
					result= true;
					min=i;
					max=j;
					break outer;
				}
			}
			
		}
		if(result==true)
		{
			for(int x=min;x<=max;x++)
			{
				System.out.println(a[x]+" ");
			}
		}
		else
		{
		System.out.println("there is no sub- arrays which gives the sum "+target);
		}
	}
}

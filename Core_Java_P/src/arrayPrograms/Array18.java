package arrayPrograms;

import java.util.Scanner;

public class Array18 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ente the size of the array");
		 int size=sc.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array elements]");
		 for ( int i =0;i<a.length;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		 System.out.println("enter the target: ");
		 int target =sc.nextInt();
		 boolean isPresent=false;
		int left=0;	      
		int right = a.length - 1;
		int count=0;
		while (left <=right) 
		{
			int mid = (left + right) / 2;
			if (a[mid]==target)
			{
				isPresent=true;
				count++;
				break;
				
			}
			else if(target>a[mid])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		if(isPresent)
		{
			System.out.println(target+" The element is present ");
		}
		else
		{
			System.out.println(target+ " The element is not present ");
		}
	}
}

package arrayPrograms;

import java.util.Scanner;

public class Array20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			boolean isPreviouslyPresent= false;
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]==a[i])
				{
					isPreviouslyPresent=true;
					break;
				}
			}
			
			
			if(isPreviouslyPresent==false)
			{
				
				count++;
			}
		}
		System.out.println("Count of distinct elements = "+count);
		
		
	}
}

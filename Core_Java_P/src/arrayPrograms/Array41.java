//writea a program to find intersection of two arrays.
//input : {3,5,6,9} {5,7,9,8,10}
//output : 5,9
package arrayPrograms;

import java.util.Scanner;

public class Array41 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		System.out.println("enter the size of second array: ");
		int size1 = sc.nextInt();
		int b[] = new int[size1];
		System.out.println("enter the array elements ");
		for (int i = 0; i < b.length; i++) {
			
			b[i] = sc.nextInt();
		
		}
		for(int i=0;i<a.length;i++)
		{
			boolean isPresent=false;
			for(int j=0;j<b.length;j++)
			{
				if(b[j]==a[i])
				{
					isPresent=true;
					break;
				}
			}
			if(isPresent)
			{
				System.out.println(a[i]);
			}
		}
	}
}

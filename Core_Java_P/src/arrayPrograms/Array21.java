package arrayPrograms;

import java.util.Scanner;

public class Array21 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//here taking the input from user;
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		//assigning the array size to array;
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			//taking value from user and adding to the array';
			a[i] = sc.nextInt();
		}
		boolean anyNonRepeated = false;
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
			if(count ==1)
			{
				anyNonRepeated=true;
				System.out.println("first non repeated : "+a[i]);
				break;
			}
		}
		if(anyNonRepeated==false)
		{
			System.out.println("there is no non-repeated element");
		}
		
		
		
	}
}

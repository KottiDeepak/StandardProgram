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
		boolean repeated = false;
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
			if(isPreviouslyPresent==true)
			{
				repeated=true;
				System.out.println("first reapeadted element "+a[i]);
				break;
			}
		}
		if(repeated==false)
		{
			System.out.println("No array elements are repeated");
		}
		
	}
}

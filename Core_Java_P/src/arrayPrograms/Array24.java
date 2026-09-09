package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array24 {
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
		int b[]=new int[a.length];
		int indexb=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				b[indexb]=a[i];
				indexb++;
			}
		}
		System.out.println("Result is : "+Arrays.toString(b));
  	}
  
}

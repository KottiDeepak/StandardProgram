//swap the array using another array

package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array08 {
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
		int result []=new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			result[i]=a[(a.length-1)-i];
		}
		System.out.println("reversed array is " +Arrays.toString(result));
	}
}

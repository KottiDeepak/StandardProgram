// reversing the array element using method ;;
package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array29 {
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
		System.out.println("result: "+Arrays.toString(rev(a)));
			
	}
	public static int[] rev(int [] a)
	{
		int x=0;
		int y=a.length-1;
		while(x<y)
		{
			int temp =a[x];
			 a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		return a;
	}

}

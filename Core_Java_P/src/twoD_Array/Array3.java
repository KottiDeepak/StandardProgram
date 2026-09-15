//Jagged array 2 dimentional array with different inner array lengths.
package twoD_Array;

import java.util.Scanner;

public class Array3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number outer arrays size");
		int outerSize=sc.nextInt();	
		int[][] a = new int[outerSize][];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("enter the"+(i+1)+" array elements");
			int innerSize=sc.nextInt();
			a[i]=new int[innerSize];
			System.out.println("enter the"+(i+1)+" inner array element one by one : ");
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("given 2-d jagged array is ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

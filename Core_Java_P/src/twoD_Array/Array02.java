//using new keyword
// int [][] a =new int [size][size]
//      or
// int [][] a=new int [size][]
//Q. waptp 2-dimentional array. read the 2-d array from user.
package twoD_Array;

import java.util.Scanner;

public class Array02 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number outer arrays size");
		int size=sc.nextInt();
		System.out.println("enter inner array size: ");
		int size1=sc.nextInt();
		int[][] a = new int[size][size1];
		System.out.println("enter the array elements");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("given array elements is ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			System.out.println("**********");
		}

	}
}

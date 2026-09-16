//lower triangle matrix 
package twoD_Array;

import java.util.Scanner;

public class Array9 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of first matrix rows: ");
		int rows = sc.nextInt();
		System.out.println("enter number of first matrix columns: ");
		int column = sc.nextInt();
		int[][] a = new int[rows][column];
		System.out.println("enter the matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		 for(int i =0;i<a.length;i++)
		 {
			 for (int j=0;j<a[i].length;j++)
			 {
				 if(i<j)
				 {
					 a[i][j]=0;
				 }
			 }
		 }
		 System.out.println("Lower triangular matrix ");
		 for(int i=0;i<a.length;i++)
		 {
			 for (int j=0;j<a[i].length;j++)
			 {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}

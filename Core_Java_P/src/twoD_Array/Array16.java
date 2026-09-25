// write a program to print the product of two matrix.
package twoD_Array;

import java.util.Scanner;

public class Array16 {
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
		System.out.println("enter number of second matrix rows: ");
		int rows1 = sc.nextInt();
		System.out.println("enter number of second matrix columns: ");
		int column1 = sc.nextInt();
		int[][] b = new int[rows1][column1];
		System.out.println("enter the matrix : ");
		for (int i = 0; i <= b.length - 1; i++) {
			for (int j = 0; j <= b[i].length - 1; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int [][]c=new int [a.length][b.length];
		
		for( int i=0;i<a.length;i++)
		{
			for ( int j=0;j<a.length;j++)
			{
				int sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for ( int j=0;j<c[i].length;j++)
			{
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}	
}

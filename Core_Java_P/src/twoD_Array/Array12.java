//sum of all row and columns of matrix 

package twoD_Array;

import java.util.Scanner;

public class Array12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
// here we are the calculating the sum of the all the rows.
		for (int i = 0; i < a.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < a[i].length; j++) {
				rowSum = rowSum + a[i][j];
			}
			System.out.println("sum of " + (i + 1) + " rows :" + rowSum);
		}
// here we are calculating the sum of the all the columns.
		for (int i = 0; i < a.length; i++) {
			int colSum = 0;
			for (int j = 0; j < a[i].length; j++) {
				colSum = colSum + a[i][j];
			}
			System.out.println("sum of " + (i + 1) + " column : " + colSum);
		}
	}
}

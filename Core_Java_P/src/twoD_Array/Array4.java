//write a program to read and print a matrix.
package twoD_Array;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");//here the row represents the outer array size.
		int rows=sc.nextInt();
		System.out.println("enter number of columns: ");//here the columns represents the inner array size.
		int column=sc.nextInt();
		int [][]a=new int [rows][column];
		System.out.println ("enter the matrix : ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("given matrix is : ");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

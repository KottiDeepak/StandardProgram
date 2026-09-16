package twoD_Array;

import java.util.Scanner;

public class Array8 {
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
		
		System.out.println("enter number of rows of second Matrix: ");
		int rows1 = sc.nextInt();
		System.out.println("enter number of columns of second Matrix: ");
		int column1 = sc.nextInt();
		int[][] b = new int[rows1][column1];
		System.out.println("enter the matrix : ");
		for (int i = 0; i <= b.length - 1; i++) {
			for (int j = 0; j <= b[i].length - 1; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		boolean equal=true;
		outer: 
		for (int i=0;i<=b.length-1;i++)
		{
			inner: 
			for(int j=0;j<=b[i].length-1;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					equal=false;
					break outer;
				}
			}
		}
		if(equal) {
			System.out.println("MTRIX ARE EQUAL");
		}
		else {
			System.out.println("MTRIX ARE NOT EQUAL");
		}
	}

}

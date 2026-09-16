package twoD_Array;

import java.util.Scanner;

public class Array11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of first matrix rows: ");
		int rows = sc.nextInt();
		System.out.println("enter number of first matrix columns: ");
		int column = sc.nextInt();
		int[][] a = new int[rows][column];
		System.out.println("enter the matrix : ");
		for (int i = 0; i <=a.length -1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int even=0;
		int odd=0;
		 for(int i =0;i<a.length;i++)
		 {
			 for (int j=0;j<a[i].length;j++)
			 {
				 if(a[i][j]%2==0)
				 {
					even++;
				 }
				 else 
				 {
					 odd++;
				 }
			 }
		 }
		 System.out.println("even number: "+even);
		 System.out.println("odd Number: "+odd);
	}
}

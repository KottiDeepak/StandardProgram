//write a program to determine whether a given matrix sparse or not take the matrix from user.
package twoD_Array;
import java.util.Scanner;
public class Array15 {
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
		int count=0;
		for (int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>(rows*column)/2)
		{
			System.out.println("this is sparse matrix");
		}
		else 
		{
			System.out.println("This is not a sparse matrix");
		}
//		System.out.println("the array :");
//		for(int i=0;i<a.length;i++)
//		{
//			for ( int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		} 
	}
	
}

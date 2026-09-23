package twoD_Array;

import java.util.Scanner;

public class DeepCopyOneMatrixToAnother {
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
        int a[][]=new int[r][];
        for( int i=0;i<a.length;i++)
            {
                  System.out.println("Enter number of elements in row " + (i + 1) + ":");
                int n=sc.nextInt();
                a[i]=new int [n];
                System.out.println("Enter elements:");
                for(int j=0;j<a[i].length;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
            }
        int b[][]=new int[r][]; 
        for(int i=0;i<a.length;i++)
            {
                b[i] = new int[a[i].length];
                for(int j=0;j<a[i].length;i++)
                    {
                        b[i][j]=a[i][j];
                    }
            }
        for(int i=0;i<b.length;i++)
            {
                for(int j=0;j<b[i].length;j++)
                    {
                        System.out.println(b[i][j]+" ");
                    }
                System.out.println();
            }
    }
}

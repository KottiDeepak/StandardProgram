package twoD_Array;

import java.util.Scanner;
public class Spiral2dArray {

	   public static void main(String args[])
	        {
		   Scanner sc=new Scanner(System.in);
		// System.out.println("enter the Number of row : ");
           int row=sc.nextInt();
           int a[][]=new int[row][];
           for( int i=0;i<a.length;i++)
               {
                  //  System.out.println("Enter number of elements in row " + (i + 1) + ":");
                   int n=sc.nextInt();
                   a[i]=new int [n];
                //  System.out.println("Enter elements:");
                   for(int j=0;j<a[i].length;j++)
                       {
                           a[i][j]=sc.nextInt();
                       }
               }
	            
	            int top=0;
	            int bottom=a.length-1;
	            int left=0;
	            int right=a[0].length-1;
	            while(left<=right&&top<=bottom)
	                {
	                    //take first take loop to go from left to right
	                    for(int i=left;i<=right;i++) 
	                        {
	                            System.out.println(a[top][i]+" ");
	                        }
	                    top++;
	                    //take loop to go from top to bottom 
	                    for(int j=top ;j<=bottom;j++)
	                        {
	                            System.out.println(a[j][right]+" ");
	                        }
	                    right--;
	                    //check let>right or not 
	                    if(left<right)
	                    {
	                        for(int i=right;i>=left;i--)
	                            {
	                                System.out.println(a[bottom][i]+" ");
	                            }
	                        bottom--;
	                    }
	                    if(top<bottom)
	                    {
	                        for(int i=bottom;i>=top;i--)
	                            {
	                                System.out.println(a[i][left]+" ");
	                            }
	                        left++;
	                    }
	                }
        }
	   
}
/**
 * import java.util.Scanner;
public class Main
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int a[][]=new int[r][];
            for( int i=0;i<a.length;i++)
                {
                    int n=sc.nextInt();
                    if(n < 0)
                    {
                    n = 0;
                    }
                    a[i]=new int [n];
                    for(int j=0;j<a[i].length;j++)
                        {
                            a[i][j]=sc.nextInt();
                        }
                }
          //  System.out.println("Matrix:");
            for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a[i].length;j++)
                        {
                            if(a[i][j]<0)
                            {
                                a[i][j]=0;
                            }
                        }
                }
            for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a[i].length;j++)
                        {
                            System.out.print(a[i][j]+" ");
                        }
                    System.out.println();
                } 
        }
    }*/

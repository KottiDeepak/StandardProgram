package arrayPrograms;

import java.util.Scanner;

public class Array16 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ente the size of the array");
		 int size=sc.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array elements ");
		 for ( int i =0;i<=a.length-1;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		 int largest=a[0];
		 int smallest=a[0];
		 for (int e:a)
		 {
			 if(e>largest)
			 {
				 largest=e;
			 }
		 
			 else if(e<smallest)
			 {
				 smallest=e;
				 
			 }
		 }
		 System.out.println("difference: "+(largest -smallest));
		 
	}
}

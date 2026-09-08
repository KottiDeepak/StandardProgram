package arrayPrograms;
import java.util.Scanner;
public class Array17 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ente the size of the array");
		 int size=sc.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array elements ");
		 for ( int i =0;i<a.length;i++)
		 {
			  a[i]=sc.nextInt();
		 }
		 
		 for (int i=0;i<=a.length-2;i++)
			 
		 {
			if (a[i+1]<a[i]) {
				System.out.println("discending ");
				break;
			}
			if(a[i+1]>a[i])
			 {
				 
			 }
			 System.out.println("Acending");
		 }
		 
	}
}

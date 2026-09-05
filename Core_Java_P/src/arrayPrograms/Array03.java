package arrayPrograms;

import java.util.Scanner;

public class Array03 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size :");
	int size=sc.nextInt();
	int a[]=new int [size];
	System.out.println("enter the value one by one :");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int countEven=0;
	int countOdd=0;
	for (int e:a)
	{
		if(e%2==0)
		{
			countEven+=1;
		}
		else 
		{
			countOdd+=1;
		}
	}
	System.out.println("Count of even is "+countEven);
	System.out.println("Count of odd is "+countOdd);
	}
}

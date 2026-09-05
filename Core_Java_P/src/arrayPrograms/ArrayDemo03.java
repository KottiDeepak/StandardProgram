package arrayPrograms;
import java.util.Scanner;
public class ArrayDemo03
{


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size :");
		int size=sc.nextInt();
		int a[]=new int [size];
		
		System.out.println("enter the value one by one :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for ( int i:a)
		{
				sum+=i;
		}
		System.out.println("sum of the array elements: " +sum);
	}
}

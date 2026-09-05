package arrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo01 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the value one by one: ");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array is "+Arrays.toString(a));
	}
}

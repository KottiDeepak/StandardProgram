package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		    for (int i = 1; i < a.length; i++) {
		        int key = a[i];
		        int j = i - 1;

		       
		        while (j >= 0 && a[j] > key) {
		            a[j + 1] = a[j];
		            j = j - 1;
		        }
		        a[j + 1] = key;
		    }
		    System.out.println("sorted array :"+Arrays.toString(a));
		}
}

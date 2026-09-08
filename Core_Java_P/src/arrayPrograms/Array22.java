//write a program to left-rotate array by k positions.
package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter k value: ");
		int k = sc.nextInt();
		for (int j = 1; j <= k; j++) {
			int temp = a[0];
			for (int i = 1; i <= a.length - 1; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("Array after " + k + " left rotations : " + Arrays.toString(a));
	}
}

//write a program to rotate array right by k positions.
package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array23 {
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
			int temp = a[a.length-1];
			for (int i = a.length-2; i >=0; i--) {
				a[i+1] = a[i];
			}
			a[0] = temp;
		}
		System.out.println("Array after " + k + " right rotations : " + Arrays.toString(a));
	}

}

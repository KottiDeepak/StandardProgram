package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array28 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("ente the size of the array");
			int size = sc.nextInt();
			int a[] = new int[size];
			System.out.println("enter the array elements ");
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				if (ispreviouslyPresent(a, i) == false) {
					count++;
				}
			}
			int b[] = new int[count];
			int index = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				if (ispreviouslyPresent(a, i) == false) {
					b[index] = a[i];
					index++;
				}
			}
			System.out.println("result: " + Arrays.toString(b));
			int x = 0;
			int y = b.length - 1;
			while (x < y) {
				int temp = a[x];
				b[x] = b[y];
				b[y] = temp;
				x++;
				y--;
			}
			System.out.println("reversed array is " + Arrays.toString(b));

		}

		public static boolean ispreviouslyPresent(int[] a, int i) {
			boolean result = false;
			for (int j = 0; j <= i - 1; j++) {
				if (a[j] == a[i]) {
					result = true;
				}
			}
			return result;
		}
	}


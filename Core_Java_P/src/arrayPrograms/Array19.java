package arrayPrograms;System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

import java.util.Scanner;

public class Array19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//boolean isAnyElementRepeated = false;
		for (int i = 0; i < a.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if (count > 1) {
				//isAnyElementRepeated = true;
				System.out.println("First repeated element : " + a[i]);
				break;
			}
			else
			{
				System.out.println("not repeat:");
			}
		}
//		if (isAnyElementRepeated == false) {
//			System.out.println("No repetation numbere are there");
//		}

	}
}

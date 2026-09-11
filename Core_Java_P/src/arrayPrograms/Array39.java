package arrayPrograms;

import java.util.Scanner;

public class Array39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean isMajority = false;
		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= a.length - 1; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if (count > (a.length / 2)) {
				isMajority = true;
				System.out.println("Majority element : " + a[i]);
				break;
			} 
			if(isMajority==false) {
				System.out.println("No Majority element Available. Sorry Kotti :)");
				break;
			}
		}
	}
}

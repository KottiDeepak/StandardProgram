package arrayPrograms;

import java.util.Scanner;
public class Array42 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
	}
}

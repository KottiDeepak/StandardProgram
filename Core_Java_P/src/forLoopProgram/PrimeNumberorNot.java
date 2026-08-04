package forLoopProgram;

import java.util.Scanner;

public class PrimeNumberorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		boolean isNPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isNPrime = false;
				break;
			}
		}
		if (isNPrime && num > 1) {
			System.out.println("Prime number ");
		} else {
			System.out.println("not a prime nmber ");
		}
	}
}

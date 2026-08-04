package forLoopProgram;

import java.util.Scanner;

public class PerfectNumbercheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of the factors is : " + sum);
		if (n == sum) {
			System.out.println("The number is perfect ");
		} else {
			System.out.println("the number is not perfect ");
		}

	}

}

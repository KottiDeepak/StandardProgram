package forLoopProgram;

import java.util.Scanner;

public class CountoftheFector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0){
				System.out.println(i);
				count += 1;
			}
		}
		  System.out.println("the count of the factor is  : " + count);
	}
}

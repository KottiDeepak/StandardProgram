// write a java program to print to check the number is prime or not 
import java.util.Scanner;

public class CheckNumberIsPrimeORNOt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println("the cound of the factor is : " + count);
		if (count == 0) {
			System.out.println("Prime number ");
		} else {
			System.out.println("not a prime nmber ");
		}
	}
}

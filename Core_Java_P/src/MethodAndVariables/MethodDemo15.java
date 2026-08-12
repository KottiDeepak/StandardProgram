/* Write a Java program where you define a static method called checkPrime.
The method should take an integer as argument and should not return anything.
It should check whether the number is prime or not and print the result.*/
package MethodAndVariables;

public class MethodDemo15 {
	public static void main(String args[])
	{
		checkPrime(7);
	}
	public static void checkPrime(int a)
	{
		boolean isNPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isNPrime = false;
				break;
			}
		}
		if (isNPrime && a > 1) {
			System.out.println("Prime number ");
		} else {
			System.out.println("not a prime nmber ");
		}
	}

}

/*Write a Java program where you define a static method called printFibonacci.
The method should take an integer n as argument and should not return anything.
It should print first n Fibonacci numbers.*/
package MethodAndVariables;

public class MethodDemo16 {
	public static void main(String args[])
	{
		fibonacci(67);
	}
	public static void fibonacci(int a)
	{
			int t=0;
			int b=1;
			int sum=0;
			
			for(int i=1;i<=a;i++)
			{
				System.out.print(sum + " ");
				t=b;
				b=sum;
				sum=t+b;
			}
		}
	}

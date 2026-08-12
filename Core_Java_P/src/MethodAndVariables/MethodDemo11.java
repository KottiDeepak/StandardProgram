/*Write a program where you define a static method called checkEvenOdd.
The method should take an integer as argument and should not return anything.
If the number is even print &quot;Even&quot; otherwise print &quot;Odd&quot;.*/
package MethodAndVariables;

public class MethodDemo11 {
	public static void main(String[] args) {
		checkEvenOdd(5);
	}
	public static void checkEvenOdd(int a)
	{
		String s=(a%2==0)?"Even Number":"ODD Number";
		System.out.println(s);
	}

}

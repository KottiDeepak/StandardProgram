/*9. Find Whether a Number is
Divisible by Both 5 and 11
Problem Statement
Write a Java program to check whether a number is divisible by both 5
and 11.
Example:
int number = 55;
Output:
Divisible by 5 and 11*/
package com.nt;

public class FindWhetherANumberDivisibleWith5OR11 {
	public static void main(String[] args) {
		int  num=55;
	    String  div=(num/5==0&&num/11==0)? "divisible with 5 and 11": "not divisible with 5 and 11";
	    System.out.println(div);
	}

}

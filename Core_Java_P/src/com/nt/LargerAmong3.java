/*3. Find the Largest Among Three
Numbers
Problem Statement
Write a Java program to find the largest among three integers.
Example:
int a = 45;
int b = 80;
int c = 60;
Output:
Largest Number = 80
Explanation
 Compare all three numbers.
 Use nested conditional operators.
 Do not use if-else.*/
package com.nt;

public class LargerAmong3 {
	public static void main(String[] args) {
		int a=45,b=30,c=50;
		int largest=(a>b&&b>c)?a:(b>c)? b:c;
		System.out.println("largest value is: "+largest);
		
	}

}

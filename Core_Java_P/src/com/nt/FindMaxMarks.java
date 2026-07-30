/*10. Find the Maximum Marks
Problem Statement
Three students scored the following marks:
int student1 = 82;
int student2 = 76;
int student3 = 91;
Write a Java program to find the highest mark.
Output:
Highest Marks = 91 */
package com.nt;

public class FindMaxMarks {
	public static void main(String[] args) {
		int s1=82;
		int s2=76;
		int s3=91;
		int largestMark=(s1>s2&&s1>s3)? s1:(s2>s3)?s2:s3;
		System.out.println("highest mark: "+largestMark);
}
}
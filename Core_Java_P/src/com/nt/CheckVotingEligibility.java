
/*7. Check Voting Eligibility
Problem Statement
Write a Java program to determine whether a person is eligible to
vote.
Example:
int age = 19;
Output:
Eligible to Vote*/
package com.nt;

public class CheckVotingEligibility {
	public static void main(String[] args) {
		int age=19;
		String result=(age>=18)? "Eligible to Vote" : "Not Eligible for Vote";
		System.out.println(result);
			}
}

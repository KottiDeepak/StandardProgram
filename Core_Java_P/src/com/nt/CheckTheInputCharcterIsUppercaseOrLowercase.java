/*6. Check Whether a Character is
Uppercase or Lowercase

Core java by Mahendra Sir

Problem Statement
Write a Java program to check whether a given character is an
uppercase or lowercase alphabet.
Example:
char ch = &#39;M&#39;;
Output:
Uppercase Letter*/
package com.nt;

public class CheckTheInputCharcterIsUppercaseOrLowercase {
	public static void main(String[] args) {
		char ch='M';
		String letter=(ch>'A'&&ch>'Z')?"lowercae":"uppercase";
		System.out.println(letter);
	}

}

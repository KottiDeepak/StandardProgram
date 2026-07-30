package com.nt;

import java.util.Scanner;

public class ConverCaptitalLetterTo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		if(ch>='a'&&ch<='z')
		{
			System.out.println((char)(ch-32));
		}
	}
}

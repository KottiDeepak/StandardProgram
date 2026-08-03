package com.nt;

public class SwitchCase {
	public static void main(String[] args) {
		int a =1;
		String result = switch(a)
		{
			case 1->
			{
				System.out.println("Apple");
				System.out.println("mango");
				yield "A";
			}
			case 2 -> "B";
			case 3 -> "C";
			case 4 -> "D";
			case 5 -> "E";
			default -> "Enter valid Input";
		};
		System.out.println(result);
	}
}

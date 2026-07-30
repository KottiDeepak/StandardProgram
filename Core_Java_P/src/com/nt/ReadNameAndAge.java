// this program is using the String next() method.
/*package com.nt;
import java.util.Scanner;
public class ReadNameAndAge 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();//in this after the space it will asign the after space value to the next variable
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		System.out.println("name is : "+name);
		System.out.println("age is :"+age);
	}
}*/

// this  program by using string nextLine()method.
package com.nt;
import java.util.Scanner;
public class ReadNameAndAge 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();//this will be take after sapce value also.
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		System.out.println("name is : "+name);
		System.out.println("age is :"+age);
	}
}


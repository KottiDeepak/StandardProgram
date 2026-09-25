package polimorphism;

import java.util.Scanner;

public class BirdFlying {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice: ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			Bird s=new Bird();
			s.fly();
		}
		else if(choice ==2)
		{
			Parrot p=new Parrot();
			p.fly();
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
	}
}
class Bird
{
	public void fly()
	{
		System.out.println("Bird is flying");
	}
}
class Parrot extends Bird
{
	public void fly()
	{
		System.out.println("Parrot is flying");
	}
}

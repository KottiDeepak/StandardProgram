package multipleClasses;

import java.util.Scanner;

public class demo2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price : ");
		int price =sc.nextInt();
		System.out.println("enter the quantity: ");
		int quantity=sc.nextInt();
		double p=(double)price*quantity;
		double discount ;
		double finalp;
		System.out.println("Total Price before discount: "+p);
		if (p>1200)
		{
			 discount=(p*10/100);
			 finalp=p-discount;
			System.out.println("Discount amount: "+discount);
			System.out.println("Total price to be paid after discount: "+finalp);
		}
		else 
		{
			discount=(p*5/100);
			finalp=p-discount;
			System.out.println("Discount amount: "+discount);
			System.out.println("Total price to be paid after discount: "+finalp);		
		}
	}
}

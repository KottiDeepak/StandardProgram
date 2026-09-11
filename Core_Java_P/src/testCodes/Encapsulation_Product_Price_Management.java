package testCodes;

import java.util.Scanner;

public class Encapsulation_Product_Price_Management {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Product s=new Product();
		System.out.println("enter the product id: ");
		int productId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter product name: ");
		String productName=sc.nextLine();
		System.out.println("enter the price: ");
		double price=sc.nextDouble();
		System.out.println("enter the discount: ");
		double percentage=sc.nextDouble();
		s.setProductId(productId);
		s.setProductName(productName);
		s.setPrice(price);
		s.applyDiscount(percentage);
		
		System.out.println("Product id: "+s.getProductId());
		System.out.println("Product name : "+s.getProductName());
		System.out.println("Price : "+s.getPrice());
		
		
	}
}
class Product
{
	private int productId;
	private String productName;
	private double price;
	
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		if(productId>0 )
		{
			
			this.productId=productId;
		}
		else 
			
		{
			this.productId=0;
		}
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void applyDiscount(double percentage)
	{
		
		if(percentage>0&&percentage<=100)
		{
			price=price-(price*percentage)/100;
		}
		
	}
}

package Encapsulation;

import java.util.Scanner;

public class Qsn04 {
	public static void main (String...args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double price=sc.nextDouble();
		sc.nextLine();
		String category=sc.nextLine();
		Product p=new Product(name,price,category);
		p.displayDetails();
		
	}

}
class Product
{
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		if(price<=0)
		{
			System.out.println("Invalid Price, Price should be greater than 0.");
			System.exit(0);
			
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public void displayDetails()
	{
		System.out.println("Product Details:");
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Category : "+category);
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
}
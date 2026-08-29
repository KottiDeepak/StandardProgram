package inheritancePrograms;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the product: ");
		String name=sc.nextLine();
		System.out.println("enter the price ");
		double price=sc.nextDouble();
		System.out.println("enter the quantity: ");
		double quantity=sc.nextDouble();
		System.out.println("enter the discount : ");
		double discount=sc.nextDouble();
		DiscountProduct p=new DiscountProduct(name,price,quantity,discount);
		//Product p=new Product(name,price,quantity);
		p.displayDetails();
		
		
	}

}
class Product 
{
	public String name;
	public double price;
	public double quantity;
	public Product(String name, double price, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void displayDetails()
	{
		System.out.println("Product name : "+name);
		System.out.println("Price of the product : "+price);
		System.out.println("Quantity of the product : "+quantity);
		System.out.println("Total  "+calculateTotal());
		
	}
	public double calculateTotal() {
		return price*quantity;
	}
}
class DiscountProduct extends Product{
	public double discount;
	public DiscountProduct(String name, double price, double quantity,double discount) {
		super(name, price, quantity);
		this.discount=discount;
	}
	public void displayDetails()
	{
		super.displayDetails();
		
	}
	public double calculateTotal()
	{
		double total=super.calculateTotal();
	return total -((total*discount)/100);
	}
}
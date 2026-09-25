package twoD_Array;

import java.util.Scanner;

public class Arrat57 {
	
	static Product[]a;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of proudcts: ");
		int n=sc.nextInt();
		a=new Product[n];
		for( int i =0;i<a.length;i++)
		{
				System.out.println("Enter productId, productName, Category, Price");
				int productId=sc.nextInt();
				sc.nextLine();
				String productName=sc.nextLine();
				String category=sc.nextLine();
				double price=sc.nextDouble();
				
				a[i]=new Product(productId,productName,category,price);
				sc.nextLine();
		}
		System.out.println("=================================================");
		System.out.println("Enter 1 for printing the deteails of Products belong to the  given category");
		System.out.println("Enter 2 for printing the details of Products who are having salary greater than the given Price");;
		System.out.println("Enter 3 for average salary");
		System.out.println("=================================================");
		System.out.println("enter your choice : ");
		int choice =sc.nextInt();
		switch(choice)
		{
			case 1->
			{
				sc.nextLine();
				System.out.println("Enter the category name :  ");
				String category=sc.nextLine();
				proBelongToGivenCategory(category);
			}
			case 2->
			{
				System.out.println("Enter the target price : ");
				double price =sc.nextDouble();
				proLessThanGivenCate(price);
			}
			case 3->
			{
				proAvgPrice();
			}
			default-> System.out.println("invalid choice: ");
		}
	}
	public static void proBelongToGivenCategory(String category)
	{
		for(Product e:a)
		{
			if(e.category.equalsIgnoreCase(category))
			{
				System.out.println("===============================");
				e.displayDetails();
			}
		}
	}
	public static void proLessThanGivenCate(double price)
	{
		for(Product e:a)
		{
			if(e.price<price)
			{
				System.out.println("===============================");
				e.displayDetails();
			}
		}
	}
	public static void proAvgPrice()
	{
		{
			double sum=0;
			for(Product e:a)
			{
				sum+=e.price;
			}
			System.out.println("Average salary: "+sum/a.length);
		}
	}
}
class Product
{
	public int productId;
	public String productName;
	public String category;
	public double price;
	public Product(int productId, String productName, String category, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Category : "+category);
		System.out.println("Product Price : "+price);
	}
}

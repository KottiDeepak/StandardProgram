package classObject;

import java.util.Scanner;

public class book {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name , author name and price one by one: ");
		String bookName=sc.nextLine();
		String authorName=sc.nextLine();
		double price =sc.nextDouble();
		book1 bk=new book1(bookName,authorName,price);
		bk.displayBookInfo();
	}

}
class book1{
	//step->01 declare static and not static variables.
	public String bookName;
	public String authorName;
	public double price;
	//step->02 initialize the non-static variables with the help of constructor.
//	public book(String bookName,String authorName,double price)
//	{
//		this.bookName=bookName;
//		this.authorName=authorName;
//		this.price=price;
//	}short cut for constructor alt+sag
	public book1(String bookName, String authorName, double price) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	//step->03 write any methods required.
	public void displayBookInfo()
	{
		System.out.println("Book name : "+bookName);
		System.out.println("Author name : "+authorName);
		System.out.println("Price : "+price);
		
	}
	public void issueBook()
	{
		System.out.println("Book issued successufully : "+bookName);	
	}
	

}

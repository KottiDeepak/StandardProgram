package twoD_Array;

import java.util.Scanner;

public class Arrat55 {
	    static Book[] a;

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of books : ");
	        int size = sc.nextInt();
	        sc.nextLine();

	        a = new Book[size];

	        for(int i = 0; i < a.length; i++)
	        {
	            System.out.println("Enter details of book :" + (i + 1));

	            System.out.println("Enter Author Name ");
	            String authorName = sc.nextLine();

	            System.out.println("Enter the Book Title");
	            String title = sc.nextLine();

	            System.out.println("Enter The Book Price ");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter the Book Published Year");
	            int publishedYear = Integer.parseInt(sc.nextLine());

	            a[i] = new Book(authorName, title, price, publishedYear);
	        }

	        System.out.println("=========================================================");
	        System.out.println("Enter 1 For getting Details of the book by author name : ");
	        System.out.println("Enter 2 For getting Details of the book published after a year : ");
	        System.out.println("Enter 3 For average price of book : ");
	        System.out.println("=========================================================");
	        System.out.println("Enter your choice : ");

	        int choice = sc.nextInt();

	        switch(choice)
	        {
	            case 1 ->
	            {
	                sc.nextLine();

	                System.out.println("Enter the Author name : ");
	                String authorName = sc.nextLine();

	                BooksByAuthor(authorName);
	            }

	            case 2 ->
	            {
	                System.out.println("Enter a Year : ");
	                int year = sc.nextInt();

	                booksPublishedAfterCertainYear(year);
	            }

	            case 3 ->
	            {
	                avgPriceOfBooks();
	            }

	            default ->
	                System.out.println("Enter a valid Choice ...");
	        }
	    }

	    public static void BooksByAuthor(String authorName)
	    {
	        for(Book b : a)
	        {
	            if(authorName.equalsIgnoreCase(b.authorName))
	            {
	                b.displayDetails();
	                System.out.println("=============================================================");
	            }
	        }
	    }

	    public static void booksPublishedAfterCertainYear(int year)
	    {
	        for(Book b : a)
	        {
	            if(b.publishedYear > year)
	            {
	                b.displayDetails();
	                System.out.println("=============================================================");
	            }
	        }
	    }

	    public static void avgPriceOfBooks()
	    {
	        double sum = 0;

	        for(Book b : a)
	        {
	            sum = sum + b.price;
	        }

	        System.out.println("Average price = " + (sum / a.length));
	    }
	}

	class Book
	{
	    public String authorName;
	    public String title;
	    public double price;
	    public int publishedYear;

	    public Book(String authorName, String title, double price, int publishedYear)
	    {
	        this.authorName = authorName;
	        this.title = title;
	        this.price = price;
	        this.publishedYear = publishedYear;
	    }

	    public void displayDetails()
	    {
	        System.out.println("Title of the Book : " + title);
	        System.out.println("Author Name : " + authorName);
	        System.out.println("Price : " + price);
	        System.out.println("Published Year : " + publishedYear);
	    }
	}
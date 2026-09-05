import java.util.Scanner;

public class inheri02 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter: ");
		int choice =sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		//int loyaltyP=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			Customer c=new Customer(name);
			c.display(choice);
			break;
		}
		case 2:
		{
			int loyaltyP=sc.nextInt();
			PremiumCustomer p= new PremiumCustomer(name,loyaltyP);
			p.display(choice);
			break;
		}
		case 3:
		{
			Customer c1=new Customer(name);
			c1.display(choice);

			String name2=sc.nextLine();
			int loyaltyP=sc.nextInt();
			PremiumCustomer p=new PremiumCustomer(name2,loyaltyP);
			p.display(choice);
		}
	 }
	}
}
class Customer
{
	public String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
	void display(int choice)
	{
		System.out.println("Customer Detials:");
		System.out.println("Name: "+name);
	}
	
}
class PremiumCustomer extends Customer
{
	public  int loyaltyP;

	public PremiumCustomer(String name, int loyaltyP) {
		super(name);
		this.loyaltyP = loyaltyP;
	}
	void display(int choice)
	{
		System.out.println("Premium Customer Details:");
		System.out.println("Name: "+name);
		System.out.println("Loyalty Points: "+loyaltyP);
	}
}
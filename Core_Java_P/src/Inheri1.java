import java.util.Scanner;

public class Inheri1 {
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter: ");
	int choice=sc.nextInt();
	int ticketId=sc.nextInt();
	sc.nextLine();
	String movieName=sc.nextLine();
	int basePrice=sc.nextInt();
	
	switch( choice)
	{
	case 1:
	{
		RegularTicket r=new RegularTicket(ticketId,movieName,basePrice);
		System.out.println("Final Price: "+r.convinceTicket(choice));
		break;
	}
	case 2:
	{
		PremiumTicket p=new PremiumTicket(ticketId,movieName,basePrice);
		System.out.println("Final Price: "+ p.luxuryfee(choice));
		break;
	}
	case 3:
	{
		IMAXTicket i=new IMAXTicket(ticketId,movieName,basePrice);
		System.out.println("Final Price: "+i.surCharge(choice));
		break;
	}
	}
 }
}
class Ticket
{
	public int ticketId;
	public String movieName;
	public int basePrice;
	public Ticket(int ticketId, String movieName, int basePrice) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.basePrice = basePrice;
	}
}
class RegularTicket extends Ticket
{

	public RegularTicket(int ticketId, String movieName, int basePrice) {
		super(ticketId, movieName, basePrice);
	}
	int convinceTicket(int choice)
	{
		int finalPrice= ((basePrice*5)/100);
		finalPrice=finalPrice+basePrice;
		return finalPrice;
	}
}
class PremiumTicket extends Ticket
{

	public PremiumTicket(int ticketId, String movieName, int basePrice) {
		super(ticketId, movieName, basePrice);
	}
	int luxuryfee(int choice)
	{
		int finalPrice= ((basePrice*12)/100);
		finalPrice=finalPrice+basePrice;
		return finalPrice;
	}
}
class IMAXTicket extends Ticket
{

	public IMAXTicket(int ticketId, String movieName, int basePrice) {
		super(ticketId, movieName, basePrice);
	}
	int surCharge(int choice)
	{
		int finalPrice=basePrice+250;
		return finalPrice;
	}
}


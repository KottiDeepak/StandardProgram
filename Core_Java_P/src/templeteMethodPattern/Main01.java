package templeteMethodPattern;

public class Main01 {
	public static void main(String args[])
	{
		Atm op1=new Widthraw();
		op1.process();
		Atm op2=new Deposit();
		op2.process();
		Atm op3=new CheckBalance();
		op3.process();
		
		
		
	}

}
abstract class Atm
{
	//template method
	 final public void process()
	{
		instertCard();
		enterPin();
		doTransaction();
		printReceipt();
		
	}
	public void instertCard()
	{
		System.out.println("card is inserted...!!");
	}
	public void enterPin()
	{
		System.out.println("Pin entered successfully");
	}
	public abstract void doTransaction();
	public void printReceipt()
	{
		System.out.println("Receit is printed....");
	}
}
class Widthraw extends Atm
{

	@Override
	public void doTransaction() {
		System.out.println("Amount is Widthraw successfylly");
		
	}
	
}
class Deposit extends Atm
{

	@Override
	public void doTransaction() {
		System.out.println("Amount is deposited successfully..");
		
	}
	
}
class CheckBalance extends Atm
{

	@Override
	public void doTransaction() {
		System.out.println("Check the available balance successfully...!!");
	}
	
}
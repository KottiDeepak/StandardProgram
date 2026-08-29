package Encapsulation;

import java.util.Scanner;

public class Qsn01 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account Number and balance: ");
		String accountNumber=sc.nextLine();
		double balance=sc.nextDouble();
		System.out.println("enter amount to deposit.: ");
		double deposit=sc.nextDouble();
		System.out.println("enter Withdrawal amount: ");
		double withdrawal=sc.nextDouble();
		MobileApp m=new MobileApp(accountNumber,balance);
		m.deposit(deposit);
		m.withdrawal(withdrawal);
		System.out.println("Final availabel balance : "+m.getBalance());
		
		
	}

}
class BankAccount{
	private String accountNumber;
	private Double balance ;
	public BankAccount(String accountNumber, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount )
	{
		if(amount>0)
		{
			balance +=amount;
			System.out.println("Amount of "+amount+" is been Deposited...");
		}
		else
		{
			System.out.println("Invalid deposit amount!...");
		}
	}
	public void withdrawal(double amount)
	{
		if(amount>0&&amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdrwal of "+amount+" is done Successfully..!");
		}
		else
		{
			System.out.println("Insufficient Balance ");
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
}
class MobileApp extends BankAccount
{

	public MobileApp(String accountNumber, Double balance) {
		super(accountNumber, balance);
		
	}
	public void withdrawal(double amount)
	{
		if(amount>25000)
		{
			
			System.out.println("Daily limit is exceeded.!!");
		}
		else
		{
			super.withdrawal(amount);
		}
	}
	
}
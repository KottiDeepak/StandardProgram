package testCodes;

import java.util.Scanner;

public class Encapsulation_Bank_Account_Details {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		System.out.println("enter Account Number: ");
		long accountNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("enter Account Holder Name: ");
		String accountHolderName=sc.nextLine();
		System.out.println("enter the deposit amount: ");
		double amount=sc.nextDouble();
		b.setAccountNumber(accountNumber);
		b.setAccountHolderName(accountHolderName);
		b.Deposit(amount);
		b.Deposit(amount=sc.nextDouble());
		System.out.println("Account Number: "+b.getAccountNumber());
		System.out.println("Account Holder Name: "+b.getAccountHolderName());
		System.out.println("Deposit : "+b.getBalance());
		
		
		
		
	}
}
class BankAccount
{
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber)
	{
		if(accountNumber>0)
		{
			
			this.accountNumber=accountNumber;
		}
		else 
		{
			this.accountNumber=0;
		}
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}

	public double Deposit(double amount)
	{
		if(amount >0)
		{
			 balance+=amount;
		}
		return balance;
	}
	
}

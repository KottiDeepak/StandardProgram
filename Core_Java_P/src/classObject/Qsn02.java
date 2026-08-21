package classObject;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName=sc.nextLine();
		System.out.println("Enter Account Number : ");
		String accountNumber=sc.nextLine();
		System.out.println("Enter Balance : ");
		double balance=sc.nextDouble();
		BankAccount ba=new BankAccount(accountHolderName,accountNumber,balance);
		ba.deposit(100);
		ba.withrawal(5000);
		ba.DisplayBalance();
		
		
	}

}
class BankAccount {
	//step-01: declare static and non-static variable
	public String accountHolderName;
	public String accountNumber;
	public double balance;
	//step-02: initialize non-static variables with constructor
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//step -03 write any method required.
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Deposit of "+amount+" is done successfully...👌👌!!");
		
	}
	public void withrawal(double amount)
	{
		if(balance>amount) {
		balance =balance-amount;
		System.out.println("withrawal of "+amount+" is done successfully...👍👍!!");
		
		}
		else{
			System.out.println("Insufficient Balance..!!😢😢");
		}	
	}
	public void DisplayBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	
}

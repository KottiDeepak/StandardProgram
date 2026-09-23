import java.util.Scanner;
public class String03 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter first customer detaisl:");
		String accountNumber=sc.nextLine();
		String accountType=sc.nextLine();
		String accountHolderName=sc.nextLine();
		double balance=sc.nextDouble();
		sc.nextLine();
		//System.out.println("enter second customer detials: ");
		String accountNumber1=sc.nextLine();
		String accountType1=sc.nextLine();
		String accountHolderName1=sc.nextLine();
		double balance1=sc.nextDouble();
		
		 if(balance<0||balance1<0)
	        {
	            System.out.println("Error: Balance must be non-negative");
	            return;
	        }
		
		BankAccount b1=new BankAccount(accountNumber,accountType,accountHolderName,balance);
		BankAccount b2=new BankAccount(accountNumber1,accountType1,accountHolderName1,balance1);
		if(accountNumber.equals(accountNumber1))
		{
			System.out.println("Accounts are equal");
			return;
		}
		else
		{
			System.out.println("Accounts are not equal");
			return;
		}
	}

}
class BankAccount
{
	public String accountNumber;
	public String accountType;
	public String accountHolderName;
	public double balance;
	public BankAccount(String accountNumber, String accountType, String accountHolderName, double balance) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public boolean equals(Object obj)
	{
		BankAccount ac=(BankAccount) obj;
		return accountNumber==ac.accountNumber;
	}
}

/**1. Bank Account Security System

Create a class BankAccount with private variables:

accountNumber
accountHolderName
balance
pin

Requirements:

Use a parameterized constructor.
Provide getters only for accountNumber and accountHolderName.
Do not provide a direct setter for balance.
Create methods deposit(), withdraw(), and changePin().
Withdrawal should happen only if the entered PIN is correct and sufficient balance exists.
PIN must be exactly 4 digits.
Display appropriate messages for invalid operations.*/
package testCodes;

import java.util.Scanner;

public class Encapsulation_Bank_Account_Security_System
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        BankAccount01 b = new BankAccount01(
                accountNumber,
                accountHolderName,
                balance,
                pin
        );

        System.out.println("Account Holder Name: " + b.getAccountHolderName());

        // Deposit
        System.out.println("Enter Deposit Amount:");
        double depositAmount = sc.nextDouble();

        b.deposit(depositAmount);

        // Withdraw
        System.out.println("Enter Withdrawal Amount:");
        double withdrawAmount = sc.nextDouble();

        System.out.println("Enter PIN:");
        int enteredPin = sc.nextInt();

        b.withdraw(withdrawAmount, enteredPin);

        // Change PIN
        System.out.println("Enter Old PIN:");
        int oldPin = sc.nextInt();

        System.out.println("Enter New PIN:");
        int newPin = sc.nextInt();

        b.changePin(oldPin, newPin);

        sc.close();
    }
}


class BankAccount01
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;


    public BankAccount01(int accountNumber, String accountHolderName,
                         double balance, int pin)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pin = pin;
    }


    public int getAccountNumber()
    {
        return accountNumber;
    }


    public String getAccountHolderName()
    {
        return accountHolderName;
    }


    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully");
            System.out.println("Current Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }


    public void withdraw(double amount, int enteredPin)
    {
        if(enteredPin == this.pin)
        {
            if(amount > 0 && balance >= amount)
            {
                balance = balance - amount;
                System.out.println(amount + " withdrawn successfully");
                System.out.println("Current Balance: " + balance);
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println("Incorrect PIN");
        }
    }


    public void changePin(int oldPin, int newPin)
    {
        if(this.pin != oldPin)
        {
            System.out.println("Incorrect Old PIN");
        }
        else if(newPin < 1000 || newPin > 9999)
        {
            System.out.println("Invalid New PIN");
        }
        else
        {
            this.pin = newPin;
            System.out.println("PIN changed successfully");
        }
    }
}
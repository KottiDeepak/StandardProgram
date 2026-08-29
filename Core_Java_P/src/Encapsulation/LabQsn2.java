package Encapsulation;

import java.util.Scanner;

public class LabQsn2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int currentPin = sc.nextInt();
	int newPin = sc.nextInt();
	Account ac = new Account();
	
	ac.changPin(currentPin, newPin);
	}
}
class Account
{
	private int pin=1234;

	
	public void changPin(int currentPin,int newPin)
	{
		if(currentPin==pin)
		{
			System.out.println("Current PIN: "+currentPin);
			System.out.println("New PIN: "+newPin);
			System.out.println("PIN changed");
			System.out.println("successfully.");
		}
		else {
			System.out.println("Incorrect current PIN. PIN change failed.");
		}
	}
	
}

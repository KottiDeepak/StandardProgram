package AbstractionProgram;

import java.util.Scanner;

public class Qsn01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE CHOICE : ");
		int choice = sc.nextInt();
		System.out.println("enter the amount : ");
		double amount = sc.nextDouble();
		Payment payment = PaymentFactory.getPaymentObject(choice);
		LoanService ls = new LoanService();
		ls.clearLoan(payment, amount);
	}
}

class LoanService {
	void clearLoan(Payment payment, double amount) {
		if (payment.Pay(amount)) {
			System.out.println("Loan cleared successcully");
			System.out.println("Loan clearance certificate grenerated ");
		} else {
			System.out.println("Payment failed. Loan not cleared ");
		}
	}
}

class PaymentFactory {
	static Payment getPaymentObject(int choice) {
		switch (choice) {
		case 1: {
			return new UPIPayment();
		}
		case 2: {
			return new CreditCardPayment();
		}
		case 3: {
			return new CryptoPayment();
		}
		case 4: {
			return new CashPayment();
		}
		default: {
			return null;
		}
		}
	}
}

interface Payment {
	boolean Pay(double amount);
}

class UPIPayment implements Payment {
	public boolean Pay(double amount) {
		System.out.println("payment of " + amount + " is done usint UPI");
		return true;
	}
}

class CreditCardPayment implements Payment

{
	public boolean Pay(double amount) {
		System.out.println("payment of  " + amount + " is done using Credit Card");
		return true;
	}
}

class CryptoPayment implements Payment {
	public boolean Pay(double amount) {
		System.out.println("payment of  " + amount + " is  done  using Crypto currency ");
		return true;
	}
}

class CashPayment implements Payment {
	public boolean Pay(double amount) {
		System.out.println("payment of  " + amount + " is  done  using Cash Payment ");
		return true;
	}

}
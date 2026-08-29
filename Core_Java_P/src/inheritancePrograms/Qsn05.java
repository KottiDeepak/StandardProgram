package inheritancePrograms;

import java.util.Scanner;

public class Qsn05 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Vehicle number: ");
		String vNumber=sc.nextLine();
		System.out.println("enter the Fuel type: ");
		String fuelType=sc.nextLine();
		System.out.println("enter the days: ");
		int days=sc.nextInt();
		System.out.println("enter per day rent: ");
		double  rentPerDay=sc.nextDouble();
		System.out.println("enter the luxury charges");
		double luxuryCharge=sc.nextDouble();
		LuxuryCar l=new LuxuryCar(vNumber,fuelType,rentPerDay,luxuryCharge);
			l.displayDetails();
			System.out.println("final rent: "+l.calculateFinalRent(days));
		
	}

}
class Vehicle
{
	public String vNumber;
	public String fuelType;
	public Vehicle(String vNumber, String fuelType) {
		this.vNumber = vNumber;
		this.fuelType = fuelType;
	}
	public void displayDetails()
	{
		System.out.println("Vehicle number: "+vNumber);
		System.out.println("Fuel type: "+fuelType);
	}
	
}
class Car extends Vehicle
{
	public double rentPerDay;

	public Car(String vNumber, String fuelType, double rentPerDay) {
		super(vNumber, fuelType);
		this.rentPerDay = rentPerDay;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Rent per Days is: "+rentPerDay);
	}
	public double calculateRent(int days)
	{
		
	   double totalRent = rentPerDay*days;
	   System.out.println("total Rent is: "+totalRent);
	   return totalRent;
	}
}
class LuxuryCar extends Car
{
	public double luxuryCharge;

	public LuxuryCar(String vNumber, String fuelType, double rentPerDay, double luxuryCharge) {
		super(vNumber, fuelType, rentPerDay);
		this.luxuryCharge = luxuryCharge;
	}
	public double calculateFinalRent(int days)
	{
		System.out.println("Luxury Charge is: "+luxuryCharge);
		double finalRent=super.calculateRent(days)+luxuryCharge;
		return finalRent;
	}
	
}

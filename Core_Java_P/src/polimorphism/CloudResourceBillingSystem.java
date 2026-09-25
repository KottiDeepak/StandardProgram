package polimorphism;

import java.util.Scanner;

public class CloudResourceBillingSystem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		int hoursUsed=sc.nextInt();
		double dataTransferGB=sc.nextDouble();
		boolean peakHours=sc.nextBoolean();
		CloudService server;
		if(choice==1)
		{
			server=new BasicCompute();
		}
		else {
			server=new PremiumCompute();
		}
		if(hoursUsed>0)
		{
			
			double bill=server.calculateBill(hoursUsed, dataTransferGB, peakHours);
			System.out.println("Total Cloud Bill: "+bill);
		}
		else
		{
			System.out.println("Error: Hours used must be greater than 0");
		}
	}
}
interface CloudService
{
	double calculateBill(int hoursUsed,double dataTransferGB,boolean peakHours);
}
class BasicCompute implements CloudService
{
	public double calculateBill(int hoursUsed,double dataTransferGB,boolean peakHours){
		
		double baseCost=200;
		double usageCost=(hoursUsed*15)+(dataTransferGB*5);
		double peakSurcharge = 0;
		if(peakHours) {
			peakSurcharge = usageCost*0.10;
		}
		return baseCost+usageCost+peakSurcharge;
	}
}
class PremiumCompute implements CloudService
{
	public double calculateBill(int hoursUsed,double dataTransferGB,boolean peakHours) {
		double baseCost=500;
		double usageCost=(hoursUsed*30)+(dataTransferGB*8);
		double peakSurcharge=0;
		if(peakHours)
		{
			peakSurcharge=usageCost*0.20;
		}
		return baseCost+usageCost+peakSurcharge;
	}
}

import java.util.Scanner;

public class lab2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details one by one ");
		String brand=sc.nextLine();
		String os=sc.nextLine();
		String gpu=sc.nextLine();
		int bettery=sc.nextInt();
		GamingPhone g=new GamingPhone(brand,os,gpu,bettery);
		g.display();
		
	}

}
class Mobile
{
	String brand;
	public Mobile(String brand) {
		super();
		this.brand = brand;
	}
	
	
}
class SmartPhone extends Mobile
{
	String os;
	public SmartPhone(String brand, String os) {
		super(brand);
		this.os = os;
	}
	
}
class GamingPhone extends SmartPhone
{
	String gpu;
	int bettery;
	public GamingPhone(String brand, String os, String gpu, int bettery) {
		super(brand, os);
		this.gpu = gpu;
		this.bettery = bettery;
	}
	public void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("OS: "+os);
		System.out.println("GPU: "+gpu);
		System.out.println("Battery: "+bettery+ " mAh");
	}
	
}
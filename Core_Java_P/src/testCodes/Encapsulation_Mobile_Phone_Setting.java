package testCodes;

import java.util.Scanner;

 public class Encapsulation_Mobile_Phone_Setting {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the brand name:");
		String brand=sc.nextLine();
		System.out.println("enter the model name: ");
		String model=sc.nextLine();
		System.out.println("enter volume: ");
		int volume=sc.nextInt();
		System.out.println("enter battery Percentage:");
		int batteryPercentage=sc.nextInt();
		MobilePhone m=new MobilePhone();
		m.setbrand(brand);
		m.setModel(model);
		m.setVolume(volume);
		m.setBetteryPercentage(batteryPercentage);
		
		System.out.println("Brand: "+m.getBrand());
		System.out.println("Model: "+m.getModel());
		System.out.println("Volume: "+m.getVolume());
		System.out.println("Battery: "+m.getBetteryPercentage());
	}
}
 class MobilePhone
{
	private String brand;
	private String model;
	private int volume;
	private int batteryPercentage;
	public String getBrand()
	{
		return brand;
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public int getVolume()
	{
		return volume;
	}
	public void setVolume(int volume)
	{
		if(volume>0&&volume<100)
		{
		this.volume=volume;
		}
		else 
		{
			this.volume=0;
		}
	}
	public int getBetteryPercentage()
	{
		return batteryPercentage;
		
	}
	public void setBetteryPercentage(int batteryPercentage)
	{
		if(batteryPercentage>0&&batteryPercentage<=100)
		{
			this.batteryPercentage=batteryPercentage;
		}
		else
		{
			this.batteryPercentage=0;
		}
	}
}

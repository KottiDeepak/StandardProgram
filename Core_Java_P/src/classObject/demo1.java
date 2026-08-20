package classObject;

import java.util.Scanner;

public class demo1 {
	public static void main(String args[])
	{
		car c1=new car();
		c1.initialization("honda", "black", 18);
				c1.display();
		
	}
}
class car
{
	public String company;
	public String color;
	public double milage;
	
	public void initialization(String company,String color,double milage)
	{
		this.company=company;
		this.color=color;	
		this.milage=milage;
	}
	
	public void display()
	{
		System.out.println("Company: "+company);
		System.out.println("Colour: "+color);
		System.out.println("Milage: "+milage);
	}
}
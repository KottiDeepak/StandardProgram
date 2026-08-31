package templeteMethodPattern;

public class Main {
	public static void main(String[] args) {
		Drink d1=new Tea();
		d1.makeDrink();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Drink d2=new Cofee();
		d2.makeDrink();
	}
}
abstract class Drink
{
	//template method provides the proper -order for method calls
	//template method should be final. 
	//Why? : so that sub-calsses whont't override.
	final void makeDrink()//template-Method-Pattern.
	{
		boilWater();
		addMainItem();
		pourIntoCup();
		addExtra();
	}
	public abstract void boilWater();
	public abstract void addMainItem();
	public abstract void pourIntoCup();
	public abstract void addExtra();
}
class Tea extends Drink
{
	public void boilWater()
	{
		System.out.println("Start boiling the water");	
	}
	@Override
	public void addMainItem() {
		System.out.println("ADD tea powder");
	}
	@Override
	public void pourIntoCup() {	
		System.out.println("Drink is poured into cup");
	}
	@Override
	public void addExtra() {
		System.out.println("adding sugar");
	}
	
}
class Cofee extends Drink
{
	public void boilWater()
	{
		System.out.println("Start boiling the water");	
	}
	@Override
	public void addMainItem() {
		System.out.println("ADD coffee powder");
	}
	@Override
	public void pourIntoCup() {	
		System.out.println("Drink is poured into cup");
	}
	@Override
	public void addExtra() {
		System.out.println("adding milk");
	}
}

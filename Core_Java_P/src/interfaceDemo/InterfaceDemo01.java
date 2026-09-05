package interfaceDemo;
public class InterfaceDemo01 {
	public static void main(String args[])
	{
		Device d=new Fan();
		d.turnOn();
		d.turnOff();
		Device d1=new light();
		d1.turnOn();
		d1.turnOff();
		Speaker d2=new Speaker();
		d2.turnOn();
		d2.connectToWifi();
		d2.turnOff();
	}
}
interface Device
{
	
	 void turnOn();//here the abstract is not compulsory.
	 void turnOff();
	
}
interface BluetoothDevice
{
	void connectToWifi();
	
}
class Speaker implements Device, BluetoothDevice
{

	public void turnOn() {
		System.out.println("Spearker is turned on");	
	}
	public void connectToWifi() {
		System.out.println("Connected Successfull with wifi");	
	}
	public void turnOff() {
		System.out.println("Spearker is turned off");	
	}
}
class Fan implements Device
{
	public void turnOn() {
		System.out.println("Fan is turned on");	
	}
	public void turnOff() {

		System.out.println("Fan is turned off");	
	}
	
}
class light implements Device
{

	public void turnOn() {
		System.out.println("light is turned on");
		
	}

	public void turnOff() {
		System.out.println("light is turned off");
		
	}
	
}

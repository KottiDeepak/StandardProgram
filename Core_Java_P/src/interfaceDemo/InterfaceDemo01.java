package interfaceDemo;

public class InterfaceDemo01 {

}
abstract class Device
{
	public abstract void turnOn();
	public abstract void turnOff();
	
}
abstract class BluetoothDevice
{
	public abstract void connectToWifi();
	
}
class Speaker extends Device,BluetoothDevice
{
	
}
class Fan extends Device
{

	@Override
	public void turnOn() {
		System.out.println("Fan is turned on");
		
	}

	@Override
	public void turnOff() {

		System.out.println("Fan is turned off");
		
	}
	
}
class light extends Device
{

	@Override
	public void turnOn() {
		System.out.println("light is turned on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("light is turned off");
		
	}
	
}

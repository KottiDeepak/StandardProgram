package classObject;

public class ConstroctorCalldemo {
	public static void main(String args[])
	{
		new A();
	}

}
class A
{
	public A()
	{
		this(1);
		System.out.println("hello ");
	}
	public A(int k)
	{
		this(1,2);
		System.out.println("byy");
	}
	public A(int a, int b)
	{
		System.out.println("hii");
	}
}
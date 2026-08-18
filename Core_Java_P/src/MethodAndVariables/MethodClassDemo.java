package MethodAndVariables;

public class MethodClassDemo {
	public static void main(String[] args) {
		MethodClassDemo obj=new MethodClassDemo();
		System.out.println(obj.getPi());
		
	}
	 int getPi()
	{
		System.out.println("hello");
		int i=10;
		if(i<2)
		{
			return 4;
		}
		System.out.println("byee");
		return 0;
	}
}

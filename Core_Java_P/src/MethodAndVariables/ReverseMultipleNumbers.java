package MethodAndVariables;

public class ReverseMultipleNumbers {
	public static void main(String args[])
	{
		int n1=235,n2=564,n3=5674,n4=2322;

		System.out.println(reverse(n1));
		System.out.println(reverse(n2));
		System.out.println(reverse(n3));
		System.out.println(reverse(n4));
		
	}
	public static int reverse(int n)
	{
		int rev=0;
		while (n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		return rev;
	}

}

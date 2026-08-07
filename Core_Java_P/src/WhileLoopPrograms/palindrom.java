//waptp  to check the number is palindrome or not.
package WhileLoopPrograms;
import java.util.Scanner;
public class palindrom {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int rev=0;
		int t=n;
		while(t!=0)
		{
			int ld=t%10;
			rev=rev*10+ld;
			t=t/10;
		}
		if(rev==n)
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not a palindrome");
		}
		
	}

}

package forLoopProgram;
import java.util.Scanner;
public class FactorsOfAGivenNumber {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for (int i =1;i<=num;i++)
		{
			//if i divides n, then only print the i 
			// agar i ne n ko divide kardiya, tab i ko print karo.
			if(num%i==0)
			{
				System.out.println(i);
			}
			
		}
	}
}

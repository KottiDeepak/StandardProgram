package forLoopProgram;
import java.util.Scanner;
public class SumofTheFactorsofTheGivenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of factor :"+sum);
	}
}

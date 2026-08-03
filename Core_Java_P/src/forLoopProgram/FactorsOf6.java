package forLoopProgram;

public class FactorsOf6 {
	public static void main (String [] args )
	{
		int n = 6;
		for(int i=1;i<=6;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}

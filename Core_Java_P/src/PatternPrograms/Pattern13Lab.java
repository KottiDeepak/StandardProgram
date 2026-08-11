package PatternPrograms;

public class Pattern13Lab {
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j<=6-i)
				{
					System.out.print(" "+j+" ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}

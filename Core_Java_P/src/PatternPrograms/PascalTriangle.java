package PatternPrograms;

public class PascalTriangle {
	public static void main(String args[])
	{
		int space=5,starSpace=1;
		for(int i=1;i<=6;i++)
		{
			//take a loop to print loop 
			for (int a=1;a<=space;a++)
			{
				System.out.print("   ");
			}
			//take a loop print starSpace
			int x=1;
			int num=i-1;
			int den=1;
			for (int b=1;b<=starSpace;b++)
			{
				System.out.print("   "+x+"   ");
				x=(x*num)/den;
				num--;
				den++;
			}
			space--;
			starSpace++;
			System.out.println();
		}
	}

}

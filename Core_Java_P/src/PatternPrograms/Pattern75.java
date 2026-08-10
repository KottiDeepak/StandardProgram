package PatternPrograms;

public class Pattern75 {
	public static void main(String[] args) {
		int space=4,starSpace=1;
		for(int i=1;i<=5;i++)
		{
			//take a loop to print loop 
			for (int a=1;a<=space;a++)
			{
				System.out.print(" ");
			}
			//take a loop print starSpace
			for (int b=1;b<=starSpace;b++)
			{
				System.out.print("*_");
			}
			space--;
			starSpace++;
			System.out.println();
		}
	}
}

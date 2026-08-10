package PatternPrograms;

public class pattern68 {
	public static void main(String[] args) {
		int space=0,star=9;
		for(int i=1;i<=5;i++)
		{
			//take a loop to print loop 
			for (int a=1;a<=space;a++)
			{
				System.out.print("   ");
			}
			for (int b=1;b<=star;b++)
			{
				System.out.print(" * ");
			}
			space++;
			star-=2;
			System.out.println();
		}
		
	}

}

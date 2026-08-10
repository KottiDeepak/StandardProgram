package PatternPrograms;

public class patternnote72 {
	public static void main(String args[])
	{
		int star=9;
		int space=0;
		   for(int i=1;i<=9;i++)
		   {
			   // take a loop to print space.
			   for(int b=1;b<=space;b++)
			   {
				   System.out.print("   ");
			   }
			   // take a to to print stars.
			   for (int a=1;a<=star;a++)
			   {
				   System.out.print(" * ");
			   }
			   if(i<=4)
			   {
				   star-=2;
				   space++;
			   }
			   else 
			   {
				   star+=2;
				   space--;
			   }
			   System.out.println();
		   }
	}

}

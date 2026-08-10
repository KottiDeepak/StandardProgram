package PatternPrograms;

public class Pattern69 {
	public static void main(String[] args) {
	   int star=1;
	   for(int i=1;i<=9;i++)
	   {
		   // take a to to print stars.
		   for (int a=1;a<=star;a++)
		   {
			   System.out.print(" * ");
		   }
		   if(i<=4)
		   {
			   star++;
		   }
		   else 
		   {
			   star--;
		   }
		   System.out.println();
	   }
	}

}

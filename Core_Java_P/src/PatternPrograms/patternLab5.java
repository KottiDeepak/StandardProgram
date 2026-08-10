/*Que 6 : Write Java program to given pattern.
--------

1   2   3   4   5  
2   4   6   8   10
3   6   9   12  15
4   8   12  16  20*/
package PatternPrograms;

public class patternLab5 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			int x=i;
			for (int j=1;j<=5;j++)
			{
				System.out.print(x+"\t");
				x=x+i;
			}
			System.out.println();
		}
	}

}

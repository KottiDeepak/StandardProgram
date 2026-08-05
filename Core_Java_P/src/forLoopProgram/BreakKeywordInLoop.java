//demonstration of break Keyword in for loop
package forLoopProgram;

public class BreakKeywordInLoop {
	public static void main(String[] args) {
		prabas_ :
		for (int i=1;i<=5;i++)
		{
			yash_: 
			for (int j=1;j<=5;j++)
			{
				System.out.println("Hello");
				break prabas_;
			}
			System.out.println("hi");
		}
		System.out.println("bye");
	}
}

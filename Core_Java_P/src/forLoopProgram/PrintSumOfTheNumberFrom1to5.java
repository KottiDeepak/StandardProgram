package forLoopProgram;

public class PrintSumOfTheNumberFrom1to5 {
	public static void main(String  args []) {
		int sum=0;
		for(int i=1;i<=5;sum=sum+i,i++);

		System.out.println("sum is : "+sum);
	}
}

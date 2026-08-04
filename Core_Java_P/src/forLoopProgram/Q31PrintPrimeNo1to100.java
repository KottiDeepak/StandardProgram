package forLoopProgram;

public class Q31PrintPrimeNo1to100 {
	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				System.out.println(n);
			}
		}
	}
}

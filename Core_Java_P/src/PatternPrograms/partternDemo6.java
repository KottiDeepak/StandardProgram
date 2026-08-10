
package PatternPrograms;

import java.util.Scanner;
public class partternDemo6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {

				if (i==j) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
	}

}

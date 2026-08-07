package WhileLoopPrograms;
import java.util.Scanner;
public class SpyRange {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the start value : ");
	        int start = sc.nextInt();
	        System.out.println("enter the end value : ");
	        int end = sc.nextInt();

	        if (start <= 0 || start > end) {
	            System.out.println("Invalid Range");
	        } 
	        else {
	            while (start <= end) {

	                int n = start;
	                int sum = 0;
	                int product = 1;

	                while (n > 0) {
	                    int digit = n % 10;

	                    sum = sum + digit;
	                    product = product * digit;

	                    n = n / 10;
	                }

	                if (sum == product) {
	                    System.out.print(start + " ");
	                }
	                start++;
	            }
	        }
	    }
	}

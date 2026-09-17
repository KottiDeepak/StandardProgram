import java.util.*;
public class array08 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the array size: ");
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        System.out.println("enter the array element");
	        for (int i = 0; i < n; i++)
	            a[i] = sc.nextInt();

	        int x = sc.nextInt();
	        int[] b = Arrays.copyOf(a, n + 1);
	        b[n] = x;

	        System.out.println("Before: " + Arrays.toString(a));
	        System.out.println("After: " + Arrays.toString(b));
	    }
	}


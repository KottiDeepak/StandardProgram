package arrayPrograms;

import java.util.Scanner;

public class ArrayArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {

            int temp = a[i];
            int original = a[i];
            int count = 0;
            int sum = 0;

            // Count number of digits
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }

            temp = a[i];

            // Calculate Armstrong sum
            while (temp != 0) {

                int ld = temp % 10;

                int power = (int) Math.pow(ld, count);

                sum = sum + power;

                temp = temp / 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            } 
            else 
            {
            	System.out.println("No Armstrong Numbers Found.");
            }
        }
    }
}
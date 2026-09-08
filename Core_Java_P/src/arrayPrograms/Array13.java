// 13. Write a program to perform binary search on a sorted array.

package arrayPrograms;
import java.util.Scanner;
public class Array13 {
 public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);

	 // Step 1: Create a sorted array
	 int[] arr = {10, 20, 30, 40, 50, 60, 70};
	 // Step 2: Take the element that we want to search
	 System.out.print("Enter element to search: ");
	 int key = sc.nextInt();
	        // Step 3: Set left to the first index
	 int left = 0;
	 // Step 4: Set right to the last index
	 int right = arr.length - 1;
	 // Step 5: Continue searching while the search range is valid
	 while (left <= right) {
	 // Step 6: Find the middle index
	 int mid = (left + right) / 2;
	        // Step 7: Check if the middle element is the element we need
	     if (arr[mid] == key) {
	          // Element found, so display its index
	          System.out.println("Element found at index " + mid);
	           // Stop the program
	         return;
	      }
	       // Step 8: If middle element is smaller than key,
	       // search in the right half
	       else if (arr[mid] < key) {
	            left = mid + 1;
	        }
	        // Step 9: If middle element is greater than key,
	        // search in the left half
	       else {
	                right = mid - 1;
	            }
	        }
	 } 
}
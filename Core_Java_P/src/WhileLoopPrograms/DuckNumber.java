package WhileLoopPrograms;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min Number");
		int min = sc.nextInt();
		System.out.println("Enter max Number");
		int max = sc.nextInt();
		
		for(int num = min; num<=max; num++) {
			
			int temp = num;
			
			int product =1 ;
			while(temp!=0) {
				
				int ld = temp%10;
				product = product *ld;
				temp=temp/10;
			}
			if(product==0) {
				System.out.println(num);
				
			}
		}
		
	}

}

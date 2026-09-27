package stringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter");
//		
//		String s=sc.nextLine();
//		String result=sc.nextLine();
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char ch=s.charAt(i);
//			result+=ch;
//	
//		}
//		if(result.equals(s)) {
//			System.out.println("Palendrome");
//		}
//		else {
//		System.out.println("Not Palendrome");
//		}
//	}
//	public static void main(String args[])
//	
//	{
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter");
//		
//		String s=sc.nextLine();
//		String result="";
//		for( int i=0;i<s.length();i++)
//		{
//			if(!result.contains(s.charAt(i)+""))
//					{
//						result+=s.charAt(i);
//					}
//		}
//		System.out.println(result);
//	}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter");
//		String s = sc.nextLine();
//		String result = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			
//			if (!result.contains(s.charAt(i) + " ")) {
//				int count = 0;
//				for (int j = 0; j < s.length(); j++) {
//					if(s.charAt(i)==s.charAt(j)) {
//						
//						count++;
//					}
//				}
//				System.out.println(s.charAt(i) + " = " + count);
//				result+=s.charAt(i);
//			}
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s = sc.nextLine();
		String result = "";
                         
		for (int i = 0; i < s.length(); i++) {
			if (!result.contains(s.charAt(i) + " ")) {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println(s.charAt(i));
					break;
				}	
			}
		}
	}
}

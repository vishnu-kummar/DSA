package LECTURE10;

import java.util.Scanner;

public class CountTargetChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter String:");
		String s= sc.next();
		
		System.out.print("Count of (ch) :");
		char ch= sc.next().charAt(0);

		int cnt=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==ch)cnt++;
		}
		System.out.println("Number of "+ch+" is "+cnt);

	}

}
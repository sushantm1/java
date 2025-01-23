package cls_;

import java.util.Scanner;

// prgm to take three i/p and print greatest
public class P_02_Greatest_num {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter First integer : ");
		int a=sc1.nextInt();
		System.out.println("Enter Second integer : ");
		int b=sc1.nextInt();
		System.out.println("Enter Third integer : ");
		int c=sc1.nextInt();
		if(a>b&&a>c) {
			System.out.println(a+" is a greatest number.");
		}
		else if (b>a&&b>c) {
			System.out.println(b+" is the greatest number.");
		}
		else if(c>a&&c>b) {
			System.out.println(c+" is the greatest number.");
		}
	}
}

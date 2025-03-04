package looping_statements;

import java.util.Scanner;

public class Odd_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for printing odd numbers using different loops.");
		System.out.println("Please enter a integer :");
		int x = sc.nextInt();
		System.out.println("Printing using For-loop :");
		for (int i = 3; i <=x; i+=2) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("Printing using while-loop :");
		int i = 3;
		while(i<=x) {
			System.out.print(i+",");
			i+=2;
		}
		System.out.println();
		System.out.println("Printing using do-while loop :");
		i=3;
		do {
			System.out.print(i+",");
			i+=2;
		}while(i<=x);
	}
}

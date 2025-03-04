package looping_statements;

import java.util.Scanner;

public class Even_num {
	public static void main(String[] args) {
		System.out.println("Program for printing even numbers using different loops.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int a = sc.nextInt();
		System.out.println("Printing using For-loop :");
		
		for(int j = 2;j<=a;j=j+2) {
			System.out.print(j+",");
		}
		System.out.println();
		System.out.println("Printing using while loop :");
		int i=2;
		while(i<=a) {
			System.out.print(i+",");
			i+=2;
		}
		System.out.println();
		System.out.println("Printing using do-while loop :");
		i=2; 
		do{
			System.out.print(i+",");
			i+=2;
		}while(i<=a);
	
	}
}
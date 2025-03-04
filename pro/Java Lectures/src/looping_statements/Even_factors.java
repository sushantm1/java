package looping_statements;

import java.util.Scanner;

import ifelse_conditions.if_else;

public class Even_factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print Even Factors of a integer.");
		System.out.println("Please enter a integer :");
		int x = sc.nextInt();
		for(int i = 2;i<=x/2;i++)
			if(x%i==0)
				if (i%2==0)
					System.out.println(i+",");
	}
}

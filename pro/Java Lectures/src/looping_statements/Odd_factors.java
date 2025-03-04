package looping_statements;

import java.util.Scanner;

public class Odd_factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print Odd factors of a integer.");
		System.out.println("Please enter a integer :");
		int x = sc.nextInt();
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				if(i%2!=0)
					System.out.println(i+",");
//			int arr[]= {1,2,3,5,56,121};
//			System.out.println(arr.length);
			
		}
	}
}

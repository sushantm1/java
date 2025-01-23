package cls_;

import java.util.Scanner;

public class P_01_Even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a integer : ");
		int a=sc.nextInt();
		while(a<0) {
			System.out.println("You entered a negative integer.");
			System.out.println("Please enter a positive integer.");
			a=sc.nextInt();
		}
		if (a%2==0) {
			System.out.println(a+" is a even number.");
		}
		else {
			System.out.println(a+" is a odd unmber.");
		}
		
	}
}

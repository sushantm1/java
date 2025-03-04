package switch_statment;

import java.util.Scanner;

public class switch_statment_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer : ");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("HI");
			break;
		case 2:
			System.out.println("Hello");
			break;
		default:
			System.out.println("Bye");
		}
	}
}

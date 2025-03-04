package switch_statment;

import java.util.Scanner;

public class One_nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number names.");
		System.out.println("Enter a number between 1-9 : ");
		int a = sc.nextInt();
		while (a<1 || a>9) {
			System.out.println("Wrong input.");
			System.out.println("please enter number between 1-9 :");
			a=sc.nextInt();
		}
		switch (a) {
		case 1:
			System.out.println("One.");
			break;
		case 2:
			System.out.println("Two.");
			break;
		case 3:
			System.out.println("Three.");
			break;
		case 4:
			System.out.println("Four.");
			break;
		case 5:
			System.out.println("Five.");
			break;
		case 6:
			System.out.println("Six.");
			break;
		case 7:
			System.out.println("Seven.");
			break;
		case 8:
			System.out.println("Eight.");
			break;
		default:
			System.out.println("Nine.");
			break;
		}
 	}
}

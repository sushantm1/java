package switch_statment;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a integer from 1-12 : ");
		int a = sc.nextInt();
		
		while (a<1||a>12) {
			System.out.println("please enter a integer between 1-12 : ");
			a = sc.nextInt();
		}
		switch (a) {
		case 1:
			System.out.println("January.");
			break;
		case 2:
			System.out.println("February.");
			break;
		case 3:
			System.out.println("March.");
			break;
		case 4:
			System.out.println("April.");
			break;
		case 5:
			System.out.println("May.");
			break;
		case 6:
			System.out.println("June.");
			break;
		case 7:
			System.out.println("July.");
			break;
		case 8:
			System.out.println("August.");
			break;
		case 9:
			System.out.println("September.");
			break;
		case 10:
			System.out.println("October.");
			break;
		case 11:
			System.out.println("November.");
			break;
		default:
			System.out.println("December.");
			break;
		}
	}
}

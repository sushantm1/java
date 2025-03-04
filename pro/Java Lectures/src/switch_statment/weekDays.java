package switch_statment;

import java.util.Scanner;

public class weekDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a integer between 1-7 : ");
		int a = sc.nextInt();
		
		 while(a<1 || a>7) {
			System.out.println("please enter integer between 1-7 : ");
			a = sc.nextInt();
		}
		switch (a) {
		case 1:
			System.out.println("it's Monday.");
			break;
		case 2:
			System.out.println("it's Tuesday.");
			break;
		case 3:
			System.out.println("it's Wednesday.");
			break;
		case 4:
			System.out.println("it's Thursday.");
			break;
		case 5:
			System.out.println("it's Friday.");
			break;
		case 6:
			System.out.println("it's Saturday");
			break;
		case 7:
			System.out.println("it's Sunday");
			break;
		default:
			break;
		}
	}
}

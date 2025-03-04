package switch_statment;

import java.util.Scanner;

public class One_hundred_numbernames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number between 1-100 :");
		int a=sc.nextInt();
		while (a<1||a>100) {
			System.out.println("!!wrong input!!");
			System.out.println("please enter a number between 1-100 :");
			a = sc.nextInt();
		}
		if(a==100) {
			System.out.println("One Hundred.");
			return;
		}
		int temp1=a;
		int temp2=a;
		
		if(a>=1&&a<=9) {
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
			case 9:
				System.out.println("Nine.");
				break;	
			}
		}
		
		if (a>=10 && a<=20) {
		switch (a) {
		case 10:
			System.out.println("Ten.");
			break;
		case 11:
			System.out.println("Eleven.");
			break;
		case 12:
			System.out.println("Twelve.");
			break;
		case 13:
			System.out.println("Thirteen.");
			break;
		case 14:
			System.out.println("Fourteen.");
			break;
		case 15:
			System.out.println("Fifteen.");
			break;
		case 16:
			System.out.println("Sixteen.");
			break;
		case 17:
			System.out.println("Seventeen.");
			break;
		case 18:
			System.out.println("Eighteen.");
			break;
		case 19:
			System.out.println("Nineteen.");
			break;
		}
	}
		

		if (a>=20&&a<=100) {
			
			switch (temp1/10) {
			case 2:
				System.out.print("Twenty");
				break;
			case 3:
				System.out.print("Thirty");
				break;
			case 4:
				System.out.print("Forty");
				break;
			case 5:
				System.out.print("Fifty");
				break;
			case 6:
				System.out.print("Sixty");
				break;
			case 7:
				System.out.print("Seventy");
				break;
			case 8:
				System.out.print("Eighty");
				break;
			case 9:
				System.out.print("Ninety");
				break;
			
		}
			if (temp2 % 10 != 0) 
			System.out.print("-");
			switch (temp2%10) {
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
			case 9:
				System.out.println("Nine.");
				break;
		}	
	}
}
}

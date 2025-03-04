package ifelse_conditions;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter first integer : ");
		int first = scanner.nextInt();
		System.out.println("enter second integer : ");
		int second = scanner.nextInt();
		System.out.println("enter third integer : ");
		int third = scanner.nextInt();
		System.out.println("enter fourth integer : ");
		int fourth = scanner.nextInt();
		System.out.println("enter fifth integer :");
		int fifth = scanner.nextInt();
		System.out.println("enter sixth integer :");
		int sixth = scanner.nextInt();
		System.out.println("enter seventh integer :");
		int seventh = scanner.nextInt();
		
		if (first>second && first>third && first>fourth && first>fifth && first>sixth && first>seventh) {
			System.out.println(first+ " is greater number.");
		}
		else {
			if (second>third && second>fourth && second>fifth && second>sixth && second>seventh) {
				System.out.println(second+" is greater number.");
			}
			else {
				if (third>fourth && third>fifth && third>sixth && third>seventh) {
					System.out.println(third+" is greater number.");
				}
				else {
					if (fourth>fifth && fourth>sixth && fourth>seventh) {
						System.out.println(fourth+" is greater number.");
					}
					else {
						if (fifth>sixth && fifth>seventh) {
							System.out.println(fifth+" is greater number.");
						}
						else {
							if (sixth>seventh) {
								System.out.println(sixth+" is greater number.");
							}
							else {
								System.out.println(seventh+" is greater number.");
							}
						}
					}
				}
			}
		}
		
	}
}

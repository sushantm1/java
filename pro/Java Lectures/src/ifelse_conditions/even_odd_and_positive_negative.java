package ifelse_conditions;

import java.util.Scanner;

public class even_odd_and_positive_negative {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int x = scanner.nextInt();
			if (x%2==0) {
				System.out.println(x+ " is even number.");
			}
			else {
				System.out.println(x+ " is odd number.");
			}
			if (x>0) {
				System.out.println("it is positive number.");
			}
			else {
				System.out.println("it is negative number. ");
			}
		
		
		}
}	

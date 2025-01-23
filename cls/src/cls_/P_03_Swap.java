package cls_;

import java.util.Scanner;

//prgm to swap two values without using third variable.
public class P_03_Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firsst integer.");
		int a=sc.nextInt();
		System.out.println("Enter firsst integer.");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
	}
}

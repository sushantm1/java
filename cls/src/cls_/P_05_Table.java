package cls_;

import java.util.Scanner;

//_05_ prgm to print table of a number
public class P_05_Table {
	public void print_table(int x) {
		System.out.println("Number Table of "+x+" is :");
		for(int i=1;i<=10;i++) {
			System.out.println(x+" X "+i+" = "+(x*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Integer to print it's table :");
		int x = sc.nextInt();
		P_05_Table tb = new P_05_Table();
		tb.print_table(x);
		sc.close();
	}
}

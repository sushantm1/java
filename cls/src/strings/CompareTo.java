package strings;

import java.util.Scanner;

public class CompareTo {
	
	public static void main(String[] args) {
		
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to compare two string using CompareTo.");
		System.out.println("Enter first string :");
		s1=sc.nextLine();
		System.out.println("Enter second string :");
		s2=sc.nextLine();
		if(s1.compareTo(s2)>0) {
			System.out.println("s1 is greater then s2.");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("s2 is greater then s1");
		}
		else {
			System.out.println("both strings are equale.");
		}
//		System.out.println("kbusdvjzc");
		
	}

}

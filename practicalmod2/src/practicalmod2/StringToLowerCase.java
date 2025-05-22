package practicalmod2;

import java.util.*;

public class StringToLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your string");
		String str1=sc.nextLine();
		String str2=str1.toLowerCase();
		System.out.println("your conerted string is : ");
		System.out.println(str2);
		sc.close();
	}
}

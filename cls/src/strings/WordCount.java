package strings;

import java.util.Scanner;

public class WordCount {
	static int counter(String s) {
		int count=0;
		String[] k=s.split(" ");
		for(String i:k) 
			count++;
		return count;
	}
	static int thiscounter(String s) {
		int count=0;
		String word="this";
		String[] k=s.split(" ");
		for(String i:k)
			if(i=="this" | i=="This")
				count++;
		return count;
	}
	public static void main(String[] args) {
		System.out.println("program to count word in a string.");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("total number of words in the given string are :"+thiscounter(s));
		
	}

}

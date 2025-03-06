package multithreading.ThreeThreads;

import java.util.Scanner;
	
public class Main extends PirimeNUmber {
	static int beg,end;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first element.");		
		beg=sc.nextInt();
		System.out.println("enter second element.");		
		end=sc.nextInt();
		AllPrimeNum(beg, end);
		sc.close();
	}
}

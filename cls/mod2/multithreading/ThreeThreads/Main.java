package multithreading.ThreeThreads;

import java.util.Scanner;
	
//class PrintTable extends Thread {
//	int n;
//	PrintTable(int n){
//		this.n=n;
//	}
//	public void print_table(int n) { 
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+" X "+i+" = "+(i*n));
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//	}
//
//	public void run() {
//		print_table(this.n);
//	}
//}
//class PrimeNumber extends Thread {
//	int beg,end;
//	PrimeNumber(int beg,int end){
//		this.beg=beg;
//		this.end=end;
//	}
//	
//	static void isPrime(int n) {
//		if(n==2||n<2)
//			return;
////			System.out.println(n+" is smaller than 2.");
//		else {
//			for(int i=2;i<=(n/2);i++) {
//				if(n%i==0)
//					return;
//			}
//			System.out.println(n+" is prime.");
//		}
//	}
//	static void AllPrimeNum(int beg,int end) {
//		System.out.println("prgm to print all prime number lies b/w "+beg+" to "+end);
//		for(int i=beg;i<=end;i++) {
//			isPrime(i);
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//	}
//	public void run() {
//		AllPrimeNum(this.beg, this.end);
//	}
//}



public class Main {
	static int beg,end,num;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to print table.");		
		num=sc.nextInt();
		System.out.println("enter first element.");		
		beg=sc.nextInt();
		System.out.println("enter second element.");		
		end=sc.nextInt();
		PrintTable ob1=new PrintTable(num);
		PrimeNumber ob2=new PrimeNumber(beg, end);
		ob1.start();
		ob2.start();
//		Thread ob3=new Thread(ob1);
//		Thread ob4=new Thread(ob2);
//		ob3.start();
//		ob4.start();
		sc.close();
	}
}

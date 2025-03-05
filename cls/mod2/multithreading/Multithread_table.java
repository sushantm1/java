package multithreading;
import java.util.Scanner;
import java.lang.Thread;

public class Multithread_table extends Thread {
	int n;
	Multithread_table(int n){
		this.n=n;
	}
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(this.n+" X "+i+" = "+(this.n*i));
		}
	try {
		Thread.sleep(500);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	public static void main(String[] args) {
		System.out.println("prgm to print table using multy threading.");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number ");
		int num1=sc.nextInt();
		System.out.println("enter the second number ");
		int num2=sc.nextInt();
		
		Multithread_table ob1=new Multithread_table(num1);
		Multithread_table ob2=new Multithread_table(num2);
		ob1.start();
		ob2.start();
		
		}
}

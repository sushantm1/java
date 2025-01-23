package cls_;

import java.util.Scanner;

//_06_ prgm to check if a number is prime or not.
public class P_06_Is_prime {
	
	public void Isprime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				System.out.println("it's not a prime number.");
				return;
			}
		}
		System.out.println("it's a prime number.");
	}
	public static void main(String[] args) {
		System.out.println("Prgm to check Prime number.");
		Scanner sc = new Scanner(System.in);
		P_06_Is_prime isp=new P_06_Is_prime();
		System.out.println("please enter a integer :");
		int x = sc.nextInt();
		if(x<=1) {
			System.out.println("please enter number above or equal to two");
		}
		else {
			isp.Isprime(x);
		}
		sc.close();
	}
}

package cls_;
import java.util.*;
//prgm to check a number is palindrome or not
public class P_07_Palindrome {
	void check(int x) {
		int val=x;
		int temp=0;
		while (val>0) {
			int rev=val%10;
			temp=temp*10+rev;
			val/=10;
//			System.out.println(x);			
		}
		if(x==temp) {
			System.out.println("It's a palindrom number.");
		}
		else {
			System.out.println("It's not a palindrom number.");
		}
//		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println("PRGM to check Palindrome Number.");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		P_07_Palindrome ob=new P_07_Palindrome();
		ob.check(a);
		sc.close();
		
	}
			
	
}

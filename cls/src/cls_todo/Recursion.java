package cls_todo;

import java.util.Scanner;

public class Recursion {
	
	public int fact(int x) {
		if(x<=1) {
			return 1;
		}
		return (fact(x-1)*x);
	}
	int i=10;
	public void table(int x) {
		if(i<1) {
			return ;
		}
		System.out.println(i+" X "+x+" = "+(x*i));
		i--;
		table(x);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		Recursion ob=new Recursion();
		System.out.println("PRGM for Factorial..");
		int fact=ob.fact(x);
		System.out.println("the factorial of "+x+" is :"+fact);
		System.out.println("table");
		ob.table(x);
	}
}

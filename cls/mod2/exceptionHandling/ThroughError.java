package exceptionHandling;

import java.util.Scanner;

//import java.util.*;

class ZeroException extends Exception{
	public ZeroException(String s) {
		super(s);
	}
}

class BothZeroException extends Exception{
	public BothZeroException(String s) {
		super(s);
	}
}
class DivisionByZeroExeption extends Exception{
	public DivisionByZeroExeption(String s) {
		super(s);
	}
}

public class ThroughError {
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int numerator=sc.nextInt();
		System.out.println("Enter second number");
		int denomenator=sc.nextInt();
		if (denomenator==0 && numerator==0) {
			throw new BothZeroException("both numerator and denomerator are zero");
		}
		else if(numerator==0) {
			throw new ZeroException("the numerator is zero");
		}
		else if (denomenator==0) {
			throw new DivisionByZeroExeption("the denomenator is zero");
		}
		
		else {
			int c=numerator/denomenator;
			System.out.println("the output is :"+c);
		}
	}
}

package exceptionHandling;

import java.util.*;
import java.util.Scanner;

import javax.naming.TimeLimitExceededException;

public class TryCatch_Block {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();	
			
			
			
			
			sc.close();
		} catch (InputMismatchException ob) {
			System.out.println("input exception");
			
		}
		catch(TimeLimitExceededException ob) {
			System.out.println("time limit exceed error occured");
		}
	}
}

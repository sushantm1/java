package problems_55;

import java.util.Scanner;

public class Arguments {
	static void  toFahrenheit(float val) {
		float f=(5*(val-32))/9;		
		System.out.println("the temp in fahrenhiet is : "+f);
	}
	static void  toCelsius(float val) {
		float c=(val*9)/5+32;		
		System.out.println("the temp in celsius is : "+c);
	}
	public static void main(String[] args) {
		float val;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your choice :");
		System.out.println("1 for celsius  to fahrenheit .");
		System.out.println("2 for fahrenheit to celsius.");
		int choice=sc.nextInt();
		while(choice!=1 && choice!=2) {
			System.out.println("please enter a valid input");
			choice=sc.nextInt();
		}
		System.out.println("please enter your value");
		val=sc.nextFloat();
		if (choice==1)
			toFahrenheit(val);
		else if(choice==2)
			toCelsius(val);
//		System.out.println("temp in fehrenhite :");
		sc.close();
	}
}


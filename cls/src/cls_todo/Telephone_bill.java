package cls_todo;

import java.util.Scanner;

public class Telephone_bill {
	int no_of_calls;
	int no_of_message;
	float data_usage;
	float data_plan;
	float bill;
	Telephone_bill(){
		no_of_calls=0;
		no_of_message=0;
		data_usage=0;
		data_plan=0;
		bill=0;
	}
	public void get_value() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NO. of calls : ");
		no_of_calls=sc.nextInt();
		System.out.println("Enter NO. of message :");
		no_of_message=sc.nextInt();
		System.out.println("Enter data usage : ");
		data_usage=sc.nextFloat();
		System.out.println("Enter data plan :");
		data_plan=sc.nextFloat();	
		sc.close();
	}
	public float calcu_bill() {
		if(no_of_calls<=100) {
			bill=0;}
		else if(no_of_calls>100 && no_of_calls<=300) {
			bill+=no_of_calls*2;}
		else if(no_of_calls>300) {
			bill+=no_of_calls*3;}
		
		if(no_of_message<=1000) {
			bill+=no_of_message*0;}
		else if(no_of_message>1000 && no_of_message<=5000) {
			bill+=no_of_message*0.5;}
		else if(no_of_message>5000) {
			bill+=no_of_message*1;	}
		
		if(data_usage>data_plan) {
			bill+=300;}
		return bill;
	}
	
	public static void main(String[] args) {
		System.out.println("PRGM to calculate telephone bill.");
		Telephone_bill ob=new Telephone_bill();
		ob.get_value();
		float final_bill=ob.calcu_bill();
		System.out.println("bill is : "+final_bill);	
	}
}

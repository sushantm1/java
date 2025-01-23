package cls_todo;

import java.util.Scanner;

public class Electricity_bill {
	
	static float unit;
	static float assi_load;
	static float current_load;
	//input_CLASS
	public void val_input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your Bill Unit = ");
		unit=sc.nextFloat();
		System.out.println("Enter your Assigned Load = ");
		assi_load=sc.nextFloat();
		System.out.println("Enter your Current load = ");
		current_load=sc.nextFloat();
		sc.close();
	}
	public float bil_on_unit(float x) {
		float amount=1.00f;
		if(x<=100) {
			amount=amount*unit*3;
		}
		else if(x>100 && x<=300) {
			amount=amount*unit*4;
		}
		else if( x>300 && x<=500) {
			amount=amount*unit*5;
		}
		else if (x>500) {
			amount=amount*unit*6;
		}
		return amount;
	}
	public float load(float amount,float assigned,float current) {
		if (current>assigned) {
			System.out.println("your Current load is greater then your Assigned load, so you'll get 10%"
					+ " as a penalty");
			amount=amount*1.10f;
//			System.out.println(amount);
//			System.out.println("");
		}
		if(assigned<=2.00f) {
			amount=amount+300;
		}
		else if(2.00<assigned && assigned<=5.00) {
			amount=amount+400;
		}
		else if(assigned>5.00) { 
			amount=amount+500;
		}
		
		return amount;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Electric bill Calculator.");
		Electricity_bill m=new Electricity_bill();
		m.val_input();
		float amount=m.bil_on_unit(unit);
		float new_amount=m.load(amount, assi_load, current_load);
		
		if(new_amount>3000.0) {
			System.out.println("Your total bill amount is over 3000rs, so you'll get 8% subsidy.");
			float subsidy=new_amount*0.08f;
			new_amount=new_amount-subsidy;
		}
		System.out.println("the final bill amount is = "+new_amount+"rs");		
	}
}

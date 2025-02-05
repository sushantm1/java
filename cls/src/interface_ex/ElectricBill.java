package interface_ex;
interface Bill{
	void calculateBill();
	default void showBill() {
		System.out.println("this is your bill amount");
	}
}

public class ElectricBill {
	
	
	public static void main(String[] args) {
		
	}
	
}

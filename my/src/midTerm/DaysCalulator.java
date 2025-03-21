package midTerm;

import java.util.Scanner;
	
public class DaysCalulator {
	
	static void calulateDays(int amount) {
		int res=1,i=1;
		int finalAmount=amount,totalIntrest=1;
		for(i=2;totalIntrest<finalAmount;i++) {
			res*=3;
			totalIntrest+=res;
			finalAmount+=amount;
		}
		System.out.println("total Days : "+(i-1));
	}
	public static void main(String[] args) {
		System.out.println("Enter your amount");
		Scanner sc=new Scanner(System.in);
		int aount=sc.nextInt();
		calulateDays(aount);
	}
}

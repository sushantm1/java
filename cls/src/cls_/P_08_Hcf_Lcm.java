package cls_;

import java.util.Scanner;

public class P_08_Hcf_Lcm {
	
	int hcf(int x,int y) {
		int div;
		if(x>y) div=y/2;
		else div=x/2;
		for(int i=div;i>=1;i--) {
			if(x/1==0 && y/i==0)
				break;
				return i;
//			System.out.println(div);
		}
		return -1;
//		System.out.println("the HCF is "+div);
	}
	public static void main(String[] args) {
		System.out.println("PRGM to check HFC and LCM of a number");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		P_08_Hcf_Lcm ob=new P_08_Hcf_Lcm();
		System.out.println("th eHCF is "+ob.hcf(a, b));
		
		sc.close();
	}
}

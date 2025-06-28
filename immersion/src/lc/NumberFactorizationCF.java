package lc;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberFactorizationCF {
	static boolean isprime(long i){
        if(i<=1){
            return false;
        }

        for(int j=2;j<Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
	
	public static ArrayList<Long> factors(long num) {
		ArrayList<Long> factors = new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		long temp=num;
		for(long i=2;i<Math.sqrt(temp);i++) {
			 if(isprime(i)){
	                int k=0;
	                if(num%i==0){
	                    while(num%i==0){
	                        k++;
	                        num/=i;

	                    }
	                    factors.add(i);
	                    list1.add(k);}
	                
//			while(num%i==0) {
//				factors.add(i);
//				num/=i;
			}
		}
		if(num>1) factors.add(num);
		System.out.println(factors);
//		return int[] {factors};
		return factors;
	}
	public static void main(String[] args) {
//		int[] arr= {100,10,864,130056192,1000000000,2,999999018};
		long num=864;
//		long num=999999018;
//		long num=130056192;
		ArrayList<Long> finallist = factors(num);
//		ArrayList<Long> temp = factors(num);
		long mul=1;
		long tem=0;
//		tem=;
		for(int i=0;i<finallist.size();i++) {
//			tem=finallist.get(i);
//			mul*=finallist.get(i);
			for(int j=i+1;j<finallist.size();j++) {
				if(finallist.get(i)!=finallist.get(j)) {
					mul=finallist.get(i)*finallist.get(j);
					finallist.remove(i);
					finallist.remove(j);
					System.out.println(mul);
					i=0;
				}
				else {
					continue;	
				}
			}
		}
//		finallist.remove(0);
		long secmul=1;
		for(int i=0;i<finallist.size();i++) {
			secmul*=finallist.get(i);
		}

//		for(int i=0;i<finallist.size();i++) {
//			mul+=finallist.get(i);
//		}
		System.out.println(mul+secmul);
	}
}

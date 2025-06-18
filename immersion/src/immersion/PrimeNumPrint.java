package immersion;

public class PrimeNumPrint {
	public static boolean isPrime(int num) {
//		int temp=1;
		if(num<2) return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int start=1;
		int end=20;
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count = "+count);
		
	}

}

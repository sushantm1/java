package multithreading.ThreeThreads;

public class PrimeNumber extends Thread {
	int beg,end;
	PrimeNumber(int beg,int end){
		this.beg=beg;
		this.end=end;
	}
	
	static void isPrime(int n) {
		if(n==2||n<2)
			return;
//			System.out.println(n+" is smaller than 2.");
		else {
			for(int i=2;i<=(n/2);i++) {
				if(n%i==0)
					return;
			}
			System.out.println(n+" is prime.");
		}
	}
	static void AllPrimeNum(int beg,int end) {
		System.out.println("prgm to print all prime number lies b/w "+beg+" to "+end);
		for(int i=beg;i<=end;i++) {
			isPrime(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public void run() {
		AllPrimeNum(this.beg, this.end);
	}
}

package multithreading.fiveThreads;

public class OddNumber extends Thread {
	int beg,end;
	OddNumber(int beg,int end){
		this.beg=beg;
		this.end=end;
	}
	public void run() {
		for(int i=beg;i<=end;i++) {
			if(i%2!=0)
				System.out.println(i+" is odd");
			try {Thread.sleep(100);} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

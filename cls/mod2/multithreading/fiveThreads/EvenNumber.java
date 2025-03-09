package multithreading.fiveThreads;

public class EvenNumber extends Thread {
	int beg,end;
	 EvenNumber(int beg,int end) {
		 this.beg=beg;
		 this.end=end;
	 }
	 public void run() {
		for(int i=beg;i<=end;i++) {
			if(i%2==0) 
				System.out.println(i+" is even");
			try {Thread.sleep(100);}
			catch (Exception e) {}
		}
	 }
}

package multithreading.ThreeThreads;

public class PrintTable extends Thread {
	int n;
	PrintTable(int n){
		this.n=n;
	}
	
	public void print_table(int n) { 
		for(int i=1;i<=10;i++) {
			System.out.println(n+" X "+i+" = "+(i*n));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void run() {
		print_table(this.n);
	}
}

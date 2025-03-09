package multithreading.ThreeThreads;

import multithreading.ThreeThreads.*;

public class Main {
	public static void main(String[] args) {
		int num1,num2,beg,end;
		EvenNumber evenOB=new EvenNumber(beg, end);
		PrintTable tableOB1=new PrintTable(num1);
		PrimeNumber primeOB=new PrimeNumber(beg,end);
		OddNumber oddOB=new OddNumber(beg, end);
		PrintTable tableOB2=new PrintTable(num2);
		tableOB1.setPriority(Thread.MAX_PRIORITY);
		oddOB.setPriority(Thread.MIN_PRIORITY);
		evenOB.start();
		tableOB1.start();
		primeOB.start();
		oddOB.start();
		tableOB2.start();
	}
}

package multithreadingwithExceptionHandling;
import java.util.*;

class ZeroException extends Exception{
	public ZeroException(String m) {
		super(m);
	}
}

class Table extends Thread{
	int low,high;
	public Table(int low,int high){
		this.low=low;
		this.high=high;
	}
	public void print_table(int low, int high) { 
		for(int i=low;i<=high;i++) {
			if(i%5==0) {
				throw new NullPointerException();
			}
		else{
			for(int j=1;i<=10;i++) {
				System.out.println(i+" X "+j+" = "+(i*j));
				}
					}
				}
		}
	
	public void run() {
		this.print_table(this.low, this.high);
	}
	
}
	class Array extends Thread{
	int arr[];
	public Array(int arr[]){
		this.arr=arr;
	}
	public void run() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				try {
					throw new ZeroException("");
				}
				catch (ZeroException e) {
					System.out.println("zero error"); 
				}
					// TODO: handle exception
				}
			}
		}
	}
	
public class TwoTaskSimultaneously{	
	public static void main(String[] args) {
		System.out.println("enter first number : ");
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		System.out.println("enter second number : ");
		int high=sc.nextInt();
		Table tb1=new Table(low, high);
		tb1.start();	
		int arr[]= {12,3,4,5,443,5,3};
		Array ar1=new Array(arr);
		ar1.start();		
		
	}
}
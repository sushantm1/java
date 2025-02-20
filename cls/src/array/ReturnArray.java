package array;

public class ReturnArray {
	
	static void interchange(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i+=2) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;		
		}
	}
	static void change(int a) {
		a=5;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		interchange(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println("array{"+i+"}="+arr[i]);
		}
			//		int a=10;
//		change(a);
//		System.out.println(a);
	}

}
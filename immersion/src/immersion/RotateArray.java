package immersion;

public class RotateArray {
	public static void reverse(int[] arr, int a, int b) {
		int start=a;
		int end=b;
		int temp=0;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void rotate(int[] arr,int index) {
		int start=0;
		int mid=index;
		int end=arr.length;
		reverse(arr,start,mid-1);
		reverse(arr,mid,end-1);
	}
	
	public static void main(String[] args) {
		int arr[]= {7,17,9,4,3};
		rotate(arr, 1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
		
	}
}

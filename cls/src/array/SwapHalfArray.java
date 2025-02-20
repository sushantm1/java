package array;

public class SwapHalfArray {
	static void swapHalf(int[] arr) {
		int mid=arr.length/2;
		int right=mid;
		int left=(arr.length%2==0) ? mid-1:mid;
		int temp=0;
		while(left>=0 && right<arr.length) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			right++;
			left--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		swapHalf(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
}

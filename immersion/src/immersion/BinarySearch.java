package immersion;

import java.util.Arrays;

public class BinarySearch {
	public static int search(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end) {
			mid=(start+end)/2;
//			System.out.println(start+" "+mid+" "+end);
			if( arr[mid]==target) return mid;
			else if(arr[mid]<target) start=mid+1;
			else if(arr[mid]>target) end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {4,7,16,19,21};
		int target=4;
		System.out.println(Arrays.toString(arr));
//		System.out.println("index val :"+search(arr, target));
	}
}

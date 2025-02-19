package mytest;

public class Com_test {
	static void reverse(int[] arr) {
		int left=(arr.length)/2;
		int right=(arr.length)/2;
//		System.out.println(left+ ","+ right);
		int temp=0;
		while(left>=0 && right<arr.length) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left--;
			right++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6};
			reverse(arr);
	}

}

package immersion;

public class KadansAlgo {
	public static void main(String[] args) {
//		int[] arr= {}
		int[] arr= {2,3,-8,7,-1,2,3};
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
			maxSum=Math.max(maxSum,sum);
			if(sum<0) {sum=0;}
		}
		System.out.println(maxSum);
	}

}

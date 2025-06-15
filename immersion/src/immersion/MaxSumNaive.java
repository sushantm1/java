package immersion;

public class MaxSumNaive {
	public static void main(String[] args) {
		int[] arr= {2,3,-8,7,-1,2,3};
		int maxSum=Integer.MIN_VALUE;
		for(int i =0;i<arr.length-1;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				maxSum=Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

}

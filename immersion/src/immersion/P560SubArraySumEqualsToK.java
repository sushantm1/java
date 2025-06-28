package immersion;

public class P560SubArraySumEqualsToK {
	public static int subarraySum(int[] nums, int k) {
        int sum=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
//            sum=Integer.MIN_VALUE;
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
//                System.out.println(sum);
                if(sum==k){
                    count++;
//                    break;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(subarraySum(arr,3));
	}
}

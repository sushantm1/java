package immersion;

public class MaxSumArray {
	public static void main(String[] args) {
		int[] nums= {5,4,-1,7,8};
		
		int res=0;
        int maxend=0;
        // int res=nums[0];
        // int max=res;
        if(nums.length==1){
//            return nums[0];
        	System.out.println(nums[0]);
        }
        // int[] let=new int[nums.lenght];

        for(int i=0;i<nums.length;i++){
            maxend =Math.max(maxend+nums[i],nums[i]);
            res=Math.max(res,maxend);
        }
        System.out.println(res);
		
//		int res=0;
//		int sum=arr[0];
//		int[] newarr =new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
////			res=arr[i];
//			sum=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				sum+=arr[j];
//			}
////			if(sum>res) res=sum;
//			newarr[i]=sum;
//			System.out.println(newarr[i]);
//		}
//		System.out.println(res);	
	}
}

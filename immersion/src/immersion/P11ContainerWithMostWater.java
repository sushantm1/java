package immersion;

public class P11ContainerWithMostWater {
	public int maxArea(int[] arr) {
		int left=0;
		int right=arr.length-1;
		int maxArea=0;
		int currentArea=Integer.MIN_VALUE;
		
		while(left<right) {
			currentArea=Math.min(arr[left],arr[right])*(right-left);
			maxArea=Math.max(maxArea, currentArea);
			if(arr[left]<arr[right]) left++;
			else right--;
		}
		return maxArea;
	}
	public static void main(String[] args) {
//		int[] arr= {3,52,67,8,2,7,8};
		int[] arr= {1,8,6,2,5,4,8,3,7d};
		
		P11ContainerWithMostWater ob=new P11ContainerWithMostWater();
		int result=ob.maxArea(arr);
		System.out.println(result);
	}
}

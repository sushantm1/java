package immersion;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class DeegreOfArray {
		public int findShortestSubArray(int[] arr) {
	        int i=0;
	        int maxcount=0;
	        int count=0;
	        Arrays.sort(arr);
	        while(i<arr.length){
	            for(int j=i;j<arr.length;j++){
	                if(arr[i]==arr[j]) {
	                	count++;
	                	maxcount=Math.max(maxcount,count);
	                }
	                else{
	                    i=j;
	                    count=0;
	                    break;
	                }
	            }
	            i++;
	        }
	    return maxcount;
		}
		public static void main(String[] args) {
			int[] arr= {1,2,2,3,1};
			DeegreOfArray ob=new DeegreOfArray();
			int res=ob.findShortestSubArray(arr);
			System.out.println(res);
	}
}

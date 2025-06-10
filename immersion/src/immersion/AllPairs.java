package immersion;

public class AllPairs {
	public static void main(String[] args) {
		int[] arr= {10,6,15,7};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
		
	}

}

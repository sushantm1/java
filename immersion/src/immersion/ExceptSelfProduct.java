package immersion;

public class ExceptSelfProduct {
		public int[] productExceptSelf(int[] arr) {
        int[] pre=new int[arr.length];
        int[] post=new int[arr.length];
        post[arr.length-1]=arr[arr.length-1];
        int[] newarr=new int[arr.length];
        // int newpre[arr.length-1]=arr[0];
        int mul=1;
        System.out.println("pre array");
        for(int i=0;i<arr.length;i++){
            mul*=arr[i];
            pre[i]=mul;
            System.out.println(pre[i]);
        }
        mul=1;
        System.out.println("post array");
        for(int i=arr.length-1;i>=0;i--){
        	mul*=arr[i];
        	post[i]=mul;
//            System.out.println(post[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
//        	mul*=arr[i];
//        	post[i]=mul;
            System.out.println(post[i]);
        }

        for(int i=0;i<arr.length;i++){
       // 	mul=1;
            if(i==0) newarr[i]=post[i+1];
            else if(i+1==arr.length) newarr[i]=pre[i-1];
            else newarr[i]=pre[i-1]*post[i+1];
        }
        System.out.println("final arr");
        for(int i=0;i<arr.length;i++){
//        	mul*=arr[i];
//        	post[i]=mul;
            System.out.println(newarr[i]);
        }

        
        return newarr;
        
	}
		public static void main(String[] args) {
			int[] arr= {1,2,3,4};
//			int[] arr= {0,0,9,0,0};
			
			ExceptSelfProduct ob=new ExceptSelfProduct();
			ob.productExceptSelf(arr);
			
			
		}

}

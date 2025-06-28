package immersion;

import java.util.Arrays;
import java.util.Scanner;

public class TargetIn2DArray {	
	public static void findtarget(int[][] arr,int target) {
		int row=0;
		int col=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					row=i;
					col=j;
					flag=true;
//					break;
				}
//				if(row!=0 && col!=0)break;		
			}
		}
		if(flag) System.out.println("arr ["+row+"]["+col+"]");
		else System.out.println("-1");

	}
	public static void main(String[] args ) {
		int[][] arr=new int[2][3];
		System.out.println("enter the array elements.");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the target:");
		int target=sc.nextInt();
//		System.out.println(Arrays.deepToString(arr));1212
		findtarget(arr, target);
	}
}

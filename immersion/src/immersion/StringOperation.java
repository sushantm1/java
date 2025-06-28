package immersion;

import java.lang.reflect.Array;
import java.util.*;

//import javax.naming.ldap.SortResponseControl;

public class StringOperation {
	public static void reverse( String s) {
//		char[] arr=s.toCharArray();
//		char[] arr2=new char[s.length()];
//		for(int i=s.length()-1,j=0;i>=0;i--,j++) {
//			arr2[j]=arr[i];
//		}
	//	System.out.println(arr2.toString());
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(sort(rev));
		Array.(rev);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		reverse(s1);
		
	}
}	

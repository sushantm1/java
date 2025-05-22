package prgm55;
//program to reverse a string
class Reversing{
//	using string builder
	public void reverse_stringBuilder(String str) {
		String newstr=new StringBuilder(str).reverse().toString();
		System.out.println("using StringNuilder.");
		System.out.println("the reversed string is : "+newstr);
	}
// using loop
	public void reverseLoop(String str) {
		String newstr="";
//	char strs[]=str.toCharArray();
		for(int i=(str.length()-1);i>=0;i--) {
		newstr+=str.charAt(i);
		}
		System.out.println("using loop");
		System.out.println("the reversed string is : "+newstr);
	}
// using recursion
	public String reverseRecursion(String str) {
		if(str.isEmpty()) {
			return str;
	}
	return reverseRecursion(str.substring(1))+str.charAt(0);
}
//using toCharArray
	public void reverse_toCharArray(String str) {
		char charArray[]=str.toCharArray();
		int left=0,right=str.length()-1;
		char temp;
		while(left<right) {
		temp=charArray[left];
		charArray[left]=charArray[right];
		charArray[right]=temp;
		left++;
		right--;
		}
		String reversed =new String(charArray);
		System.out.println("using toCharArray()");
		System.out.println("the reversed string is : "+reversed);
	}
}

public class P30_ReverseString {
	public static void main(String[] args) {
		String str="sushant";
		Reversing rev=new Reversing();
		rev.reverseLoop(str);
		rev.reverse_stringBuilder(str);
		String usable=rev.reverseRecursion(str);
		System.out.println("using recursion: "+usable);
		rev.reverse_toCharArray(str);
	}
}
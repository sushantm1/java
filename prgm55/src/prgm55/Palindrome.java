package prgm55;

public class Palindrome {
	static void number_is_Palindrome(int n) {
		int check = 0,rest=n,rem=0;
		while(rest>0) {
			rem=rest%10;
			check=check*10+rem;
			rest/=10;
		}
		String result=(check==n)?"the number is palindrome" : "not palindrome";
		System.out.println(result);
	}
	static void string_is_palindrome(String str) {
//		char strarray[]=str.toCharArray();
		String newstr="";
		for(int i=str.length()-1;i>=0;i--) {
			newstr+=str.charAt(i);
		}
//		System.out.println(newstr);
		String result=(str.equals(newstr))?"the string is palindrome":"not palindrome";
		System.out.println(result);
	}
	public static void main(String[] args) {
		int num=141;
		String str="aha";
//		Palindrome check=new Palindrome();
		number_is_Palindrome(num);
		string_is_palindrome(str);
	}
}

package prgm55;

public class P39_SplitStrings {
	public static void main(String[] args) {
		String str1="My name is Sushant, and this is a example of java program using StringEndsWith";
		String[] words=str1.split("\\s");// split the string based on white spaces.
		for(String s:words) {
			System.out.println(s);
		}
	}
}

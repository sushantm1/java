package strings;

public class SplitFunc {
	public static void main(String[] args) {
		String s="hello@my@name@is@sushant";
		String[] k=s.split("@",0);
		for(String i:k) {
			System.out.println(i);
		}
	}
}

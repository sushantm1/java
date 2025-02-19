package polymorphism;
class hello{
	void java() {
		System.out.println("hello");
	}
}
public class MethodOverriding extends hello {
	void java() {
		super.java();
		System.out.println("in main class");
	}
	public static void main(String[] args) {
		MethodOverriding ob =new MethodOverriding();
		ob.java();
	}
}

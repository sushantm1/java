package prgm55;

public class P42_methods {
	public static void main(String[] args) {
		staticMethod();
		P42_methods object = new P42_methods(); object.nonStaticMethod();
		}
		// Static method
		static void staticMethod() {
		System.out.println("Static method can be called without creating object");
		}
		// Non static method
		void nonStaticMethod() {
		System.out.println("Non static method must be called by creating an object");
	}
}

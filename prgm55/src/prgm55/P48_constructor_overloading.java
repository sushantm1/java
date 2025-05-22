package prgm55;

public class P48_constructor_overloading {
	String name;
	P48_constructor_overloading() {
		System.out.println("Constructor method called.");
	}
	P48_constructor_overloading(String str){
		name=str;
	}
	public static void main(String[] args) { P48_constructor_overloading cpp = new P48_constructor_overloading(); 
	P48_constructor_overloading java = new P48_constructor_overloading("Java");
	cpp.setName("C++");
	java.getName(); cpp.getName();
	}
	void setName(String t) { name = t;
	}
	void getName() {
		System.out.println("Language name: " + name);
	}
}

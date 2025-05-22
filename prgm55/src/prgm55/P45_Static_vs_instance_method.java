package prgm55;

public class P45_Static_vs_instance_method {
	public static void main(String[] args) { display();
	P45_Static_vs_instance_method t = new P45_Static_vs_instance_method
		(); t.show(); //calling using object
	}
	static void display() { System.out.println("Programming is amazing.");
	}
	void show(){
		System.out.println("Java is awesome.");
	}

}

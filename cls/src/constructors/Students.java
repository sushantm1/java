package constructors;

public class Students {
	int rollno;
	String name;
	protected void display() {
		rollno=52;
		name="Sushant";
		System.out.println("roll no = "+rollno);
		System.out.println("Name = "+name);
	}
	public static void main(String[] args) {
		Students ob=new Students();
		ob.display();
	}
}

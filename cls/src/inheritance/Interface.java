package inheritance;

interface Sup_Parent{
	void print(int n);
}
lass Child_Interface implements Sup_Parent{
	public void print(int n) {
		System.out.println("the number is : "+n);
	}
}
public class Interface extends Child_Interface{
	public static void main(String[] args) {
		Interface ob=new Interface();
		ob.print(8);
	}
}
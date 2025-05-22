package inheritance;

//import java.util.*;
class Parent{
	public void print(int n) {
		System.out.println("the number is : "+n);
	}
}
public class Parent_child extends Parent {
	public static void main(String[] args) {
		Parent_child ob=new Parent_child();
		ob.print(12);
	}
}

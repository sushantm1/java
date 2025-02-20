package classesAndObjects;

class xyz{
	int a=10;
	int b=20;
}

public class ClassExamp {

	public static void main(String[] args) {
		
//		int x=10;
//		int y=20;
//		int s=1+(x++);
////		System.out.println("x"+x++);
//		System.out.println("s"+s);
//		System.out.println("x"+x);
		
		int a=5,b=23;
		if(a>=b)a+=34;
		a+=7;
		b=a+(b--);
		System.out.println("b"+b);
		System.out.println("b"+b);
		a=b++;
		System.out.println("a"+a);
		b=--a;
		System.out.println("b"+b);
		a=a+b;
		System.out.println("a"+a);
		a=a-b;
		System.out.println(a);
				
		
		
//		xyz ob1=new xyz();
//		xyz ob2=ob1;
//		ob2.a=00;
//		System.out.println("ob1 : "+ob1.a + ob1.b);
//		System.out.println("ob2 : "+ob2.a + ob2.b);
	}
}

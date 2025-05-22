package lab;

import java.util.Scanner;

public class Stack_in_array {
	private int top;
	private int[] stack;
	private int maxSize;
	
	public Stack_in_array(int size) {
		maxSize=size;
		stack=new int[maxSize];
		top=-1;
	}
	//push operation
	public void push(int value) {
		if(top==maxSize-1) {
			System.out.println("Stack OverFlow Cannot push "+value);
		}else {
			stack[++top]=value;
			System.out.println("pushed to stack");
		}
	}
	//pop operation
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow! Stack is empty.");
			return -1;
		}else {
			int poppedvalue=stack[top--];
			System.out.println(poppedvalue+" popped from stack.");
			return poppedvalue;
		}
	}
	//peak operation
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty,");
			return -1;
		} else {
			return stack[top];
		}
	}
	//display
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty.");
		} else{
			System.out.println("Stack elements are:");
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stack size : ");
		int size=sc.nextInt();
		Stack_in_array stack=new Stack_in_array(size);
		
		while(true) {
			System.out.println("\nSatck Operation Menu:");
			System.out.println("1, Push\n2.pop\n3. Peek\n4. Display\n5. Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter value to push: ");
				int value=sc.nextInt();
				stack.push(value);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				int topValue=stack.peek();
				if(topValue!=-1)
					System.out.println("Top element is:"+ topValue);
				break;
			case 4:
				stack.display();
				break;
			case 5:
				System.out.println("Exiting....");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid chioce! Try again.");
			}
		}
	}
}

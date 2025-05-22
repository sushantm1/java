package lab;
import java.util.Scanner;

public class Circular_queue {
	    private int[] queue;
	    private int front, rear, size, capacity;

	    public Circular_queue(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }
	    // Enqueue operation
	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue Overflow! Cannot enqueue " + value);
	        } else {
	            rear = (rear + 1) % capacity;
	            queue[rear] = value;
	            size++;
	            System.out.println(value + " enqueued.");
	        }
	    }

	    // Dequeue operation
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue Underflow! Cannot dequeue.");
	            return -1;
	        } else {
	            int value = queue[front];
	            front = (front + 1) % capacity;
	            size--;
	            System.out.println(value + " dequeued.");
	            return value;
	        }
	    }

	    // Peek front
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return -1;
	        } else {
	            return queue[front];
	        }
	    }
	    // Display all elements
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        System.out.println("Queue elements:");
	        for (int i = 0; i < size; i++) {
	            System.out.println(queue[(front + i) % capacity]);
	        }
	    }
	    // Check if full
	    private boolean isFull() {
	        return size == capacity;
	    }
	    // Check if empty
	    private boolean isEmpty() {
	        return size == 0;
	    }
	    // Main method for menu
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of Circular Queue: ");
	        int n = sc.nextInt();

	        Circular_queue cq = new Circular_queue(n);

	        while (true) {
	            System.out.println("\nCircular Queue Operations:");
	            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit");
	            System.out.print("Enter your choice: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Enter value to enqueue: ");
	                    int val = sc.nextInt();
	                    cq.enqueue(val);
	                    break;
	                case 2:
	                    cq.dequeue();
	                    break;
	                case 3:
	                    int peek = cq.peek();
	                    if (peek != -1)
	                        System.out.println("Front element: " + peek);
	                    break;
	                case 4:
	                    cq.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}

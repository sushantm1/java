package lab;

import java.util.Scanner;

public class Queue_using_array {
	private int front, rear, size;
    private int[] queue;
    private int maxSize;

    public Queue_using_array(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        this.size = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (size == maxSize) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue.");
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1;
        } else {
            int dequeuedValue = queue[front];
            front = (front + 1) % maxSize;
            size--;
            System.out.println(dequeuedValue + " dequeued from queue.");
            return dequeuedValue;
        }
    }

    // Peek operation
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queue[front];
        }
    }

    // Display operation
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements are:");
            for (int i = 0; i < size; i++) {
                System.out.println(queue[(front + i) % maxSize]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue_using_array queue = new Queue_using_array(size);

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1)
                        System.out.println("Front element is: " + frontValue);
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

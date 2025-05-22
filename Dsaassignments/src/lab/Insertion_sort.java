package lab;

import java.util.Scanner;
public class Insertion_sort {
	    // Method to perform insertion sort
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 1; i < n; i++) {
	            int key = arr[i];      // Current element to be inserted
	            int j = i - 1;

	            // Move elements of arr[0..i-1], that are greater than key,
	            // to one position ahead of their current position
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];  // Shift element right
	                j--;
	            }
	            arr[j + 1] = key; // Insert the key in its correct position
	        }
	    }
	    // Method to print the array
	    public static void printArray(int[] arr) {
	        System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        insertionSort(arr);  // Sort the array
	        printArray(arr);     // Display the sorted array
	        sc.close();
	    }
	}
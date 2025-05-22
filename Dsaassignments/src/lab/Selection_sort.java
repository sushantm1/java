package lab;

import java.util.Scanner;
public class Selection_sort {

	    // Method to perform selection sort
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        // One by one move the boundary of the unsorted subarray
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            // Find the minimum element in the unsorted array
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            if (minIndex != i) {
	                int temp = arr[minIndex];
	                arr[minIndex] = arr[i];
	                arr[i] = temp;
	            }
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

	        selectionSort(arr);  // Sort the array
	        printArray(arr);     // Display the sorted array

	        sc.close();
	    }
}

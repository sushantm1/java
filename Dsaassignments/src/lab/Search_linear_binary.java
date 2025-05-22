package lab;
import java.util.Arrays;
import java.util.Scanner;

public class Search_linear_binary {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();
		System.out.println("Choose search method:");
		System.out.println("1. Linear Search");
		System.out.println("2. Binary Search");
		int choice = sc.nextInt();
		int result = -1;
		if (choice == 1) {
			result = linearSearch(arr, key);
		} else if (choice == 2) {
			Arrays.sort(arr); // Binary search needs sorted array
			result = binarySearch(arr, key);
		} else {
			System.out.println("Invalid choice.");
		}
		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index: " + result);
		}
		sc.close();
	}
}
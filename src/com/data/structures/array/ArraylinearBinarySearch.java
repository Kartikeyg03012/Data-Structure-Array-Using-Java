/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.array;

public class ArraylinearBinarySearch {

	// Linear Search....-->TC:- O(n)
	public static int linearSearch(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println("Element Found At Position: " + (i + 1));
				return i + 1;
			}
		}
		System.out.println("Element Not Found");
		return -1;
	}

	// Binary Search -->TC:- O(log n)
	public static int binarySearch(int arr[], int element, int size) {
		int low = 0, mid = 0, high = size;

		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == element) {
				System.out.println("Element Found...");
				return 1;
			} else if (element < arr[mid]) {
				high = mid - 1;
			} else if (element > arr[mid]) {
				low = mid + 1;
			}
		}
		System.out.println("!!!! Element Not Found !!!!");
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 345, 532, 11, 4245, 123, 642, 99, 123, 6, 2123, 1354, 123, 45, 6546, 356, 532, 52 };

		// linearSearch(arr, 12300);

		// For Binary Search array *MUST* be sorted..
		int array[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		binarySearch(array, 12, 10);
	}

}

/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.algorithms;

public class SelectionSort {
	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		int indexOfMin, temp;

		for (int i = 0; i < n - 1; i++) {
			System.out.println("Pass " + (i + 1));
			indexOfMin = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (arr[j] < arr[indexOfMin]) {
					indexOfMin = j;
				}
			}
			// Swap A[i] and A[indexOfMin]
			temp = arr[i];
			arr[i] = arr[indexOfMin];
			arr[indexOfMin] = temp;
			System.out.println("Printing Array...");
			showData(arr);
		}
	}

	public static void main(String[] args) {
		// Not Sorted Array
		int arr[] = { 23, 54, 13, 46, 89, 34, 10, 4, 5, 69 };
		// Sorted Array
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Array Before Sorting");
		showData(arr);
		System.out.println("Sorting The Array Using Bubble Sort");
		selectionSort(arr);
		System.out.println("Array After Sorting");
		showData(arr);

	}

}

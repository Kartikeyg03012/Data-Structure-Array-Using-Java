/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.algorithms;

public class InsertionSort {
	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int[] arr) {
		int j, key;
		for (int i = 1; i < arr.length - 1; i++) {
			key = arr[i];
			j = i - 1;
			System.out.println("Pass " + i);
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// Not Sorted Array
		// int arr[] = { 23, 54, 13, 46, 89, 34, 10, 4, 5, 69 };
		// Sorted Array
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Array Before Sorting");
		showData(arr);
		System.out.println("Sorting The Array Using Bubble Sort");
		insertionSort(arr);
		System.out.println("Array After Sorting");
		showData(arr);

	}
}

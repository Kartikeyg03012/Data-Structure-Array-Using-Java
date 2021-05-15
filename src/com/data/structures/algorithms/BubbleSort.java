/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */


package com.data.structures.algorithms;

public class BubbleSort {

	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		boolean isSorted = false;
		// Loop For No of Passes
		for (int i = 0; i < arr.length - 1; i++) {
			int temp;
			System.out.println("Pass " + (i + 1));
			isSorted = true;
			// Loop For No of Compare/Swap
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				return;
			}
		}

	}

	public static void main(String[] args) {
		// Not Sorted Array
		int arr[] = { 23, 54, 13, 46, 89, 34, 10, 4, 5, 69 };
		// Sorted Array
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 90 };

		System.out.println("Array Before Sorting");
		showData(arr);
		System.out.println("Sorting The Array Using Bubble Sort");
		bubbleSort(arr);
		System.out.println("Array After Sorting");
		showData(arr);
	}
}

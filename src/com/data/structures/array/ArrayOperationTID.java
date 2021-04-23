/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.array;

public class ArrayOperationTID {

	// Array Traversal -->TC:- O(n)
	public static void display(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		System.out.println();
	}

	// Array Insertion... -->TC:- O(n)
	public static void insertElement(int arr[], int lastIndex, int index, int value) {
		System.out.println("Insert Element: " + value + " At " + (index + 1) + " Position.");
		for (int i = lastIndex; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = value;
	}

	// Array Deletion... -->TC:- O(n)
	public static void deleteElement(int arr[], int index) {
		System.out.println("Delete Element: " + arr[index] + " From " + (index + 1) + " Position.");
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[20];
		arr[0] = 89;
		arr[1] = 23;
		arr[2] = 30;
		arr[3] = 45;
		display(arr);
		insertElement(arr, 3, 1, 69);
		display(arr);
		deleteElement(arr, 2);
		display(arr);
	}
}

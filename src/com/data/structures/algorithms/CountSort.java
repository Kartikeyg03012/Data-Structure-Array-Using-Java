/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.algorithms;

public class CountSort {

	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void countSort(int[] arr) {
		int max = -99999;
		int temp = 0;
		System.out.println("Array Before Sort:");
		showData(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int[] num = new int[max + 1];
		int i;
		for (int j = 0; j < arr.length; j++) {
			i = arr[j];
			temp = num[i];
			num[i] = temp + 1;
		}
		temp = -1;
		for (int j = 0; j < num.length; j++) {
			while (num[j] != 0) {
				arr[++temp] = j;
				num[j]--;
			}
		}
		System.out.println("Array After Sort:");
		showData(arr);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 21, 3, 7, 5, 45, 29, 11, 3 };
		countSort(arr);

	}

}

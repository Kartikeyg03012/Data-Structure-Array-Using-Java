/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.array;

import java.util.Scanner;

public class ArrayOneD {
	public static void main(String[] args) {
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No Of Rows: ");
		int n = sc.nextInt();
		Student[] arr = new Student[n];
		Scanner ar = new Scanner(System.in);
		int roll;
		String fname;
		String lname;

		for (int i = 0; i < n; i++) {
			System.out.println("Set Data In " + (i + 1) + " Row...");
			System.out.println("Enter First name: ");
			fname = ar.nextLine();
			System.out.println("Enter Last name: ");
			lname = ar.nextLine();
			System.out.println("Enter Roll No: ");
			roll = sc.nextInt();
			// Set the values in array
			std.setDetails(arr, i, fname, lname, roll);

		}

		// get the values from array.....
		std.showDetail(arr);

	}

}

// Example Of ADT ARRAY.....
class Student {
	// set of values
	String first_name;
	String last_name;
	int roll_no;

	Student() {

	}

	Student(String first_name, String last_name, int roll_no) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.roll_no = roll_no;
	}

	// operation 1....
	public static void setDetails(Student[] arr, int n, String first_name, String last_name, int roll_no) {
		arr[n] = new Student(first_name, last_name, roll_no);

	}

	// operation 2...
	public static void showDetail(Student arr[]) {
		System.out.println("Getting Data...");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Info Of " + (i + 1) + " Student is: " + arr[i].first_name + "\t" + arr[i].last_name
					+ "\t" + arr[i].roll_no);
		}
	}
}

/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.stack;

public class StackUsingArray {
	public static void main(String[] args) {
		// Make a obj of Class Stack
		Stack st = new Stack();
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();
		System.out.println("-----------Push Operations------------");
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();
		st.push(110);
		st.push(220);
		st.push(330);
		st.push(440);

		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();

		System.out.println("-----------Pop Operations------------");
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();

		System.out.println("-----------Push Operations------------");
		st.push(12);
		st.push(22);
		st.push(32);
		st.push(42);

		System.out.println("-----------Check Status Of Stack------------");
		st.checkStackStatus();

		System.out.println("-----------Peek Operation In Stack ------------");
		st.peek(2);

		System.out.println("-----------Get All Elements Using Peek Operation In Stack ------------");
		for (int i = 1; i <= (st.top + 1); i++) {
			st.peek(i);
		}

		System.out.println("-----------Stack Top Operation In Stack ------------");
		// Top Element in Stack
		st.stackTop();

		System.out.println("-----------Stack Bottom Operation In Stack ------------");
		// Last Element in Stack
		st.stackBottom();
	}

}

// declare the Class For implementation the Stack
class Stack {
	// size of stack
	private static int size = 10;
	int data;
	// Top element
	static int top;
	// here i'm using array to implement a Stack....
	static int arr[] = new int[size];

	Stack() {
		top = -1;
	}

	// Check Stack Status --> TC: O(1)
	public static int checkStackStatus() {
		if (top < 0) {
			// check stack is empty or not
			System.out.println("Stack Is Empty!!!");
			return -1;
		} else if (top == size - 1) {
			// check stack is full or not Or you can say stack is overflow or not
			System.out.println("Stack Is Full / OverFlow...");
			return 1;
		} else {
			// if all three conditions are wrong then this will execute
			System.out.println("Value Of Top is: " + top + " Out Of " + (size - 1));
			// size-1 = 9, because it starts from 0 so, 0 to 9= 10 elements
			return 0;
		}
	}

	// Stack Push Operation --> TC: O(1)
	public static boolean push(int data) {
		if (top == size - 1) {
			// check status is stack overflow ?
			System.out.println("Stack Is Full, Data Can Not be inserted");
			return false;
		} else {
			arr[++top] = data;
			System.out.println(data + " Inserted Successfully...");
			return true;
		}
	}

	// Stack Pop Operation --> TC: O(1)
	public static boolean pop() {
		if (top < 0) {
			// check status is stack overflow ?
			System.out.println("Stack Is Empty!!!");
			return false;
		} else {
			System.out.println(arr[top--] + " is Popped...");
			return true;
		}
	}

	// Stack Peek operation By Position --> TC: O(1)
	// Array Last index = 1st Position Of Stack
	public static void peek(int position) {
		int temp = top - position + 1;
		if (temp < 0) {
			System.out.println("Invalid Position");
		} else {
			System.out.println("At " + position + " Position In Stack, Value is: " + arr[temp]);
		}
	}

	// Stack Top Operation --> TC: O(1)
	public static void stackTop() {
		if (top >= 0) {
			System.out.println("Top Element Of Stack Is: " + arr[top]);
		} else {
			System.out.println("Not Found!!");
		}
	}

	// Stack Bottom Operation --> TC: O(1)
	public static void stackBottom() {
		if (top >= 0) {
			System.out.println("Last Element Of Stack Is: " + arr[0]);

		} else {
			System.out.println("Not Found!!");
		}
	}

}
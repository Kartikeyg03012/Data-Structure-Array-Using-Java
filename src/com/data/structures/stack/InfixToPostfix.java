/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.stack;

public class InfixToPostfix {
	static class Stack {
		// size of stack
		private static int size = 20;
		int data;
		// Top element
		static int top;
		// here i'm using array to implement an Array....
		static char arr[] = new char[size];

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
			}
			return 0;
		}

		// Stack Push Operation --> TC: O(1)
		public static boolean push(char data) {
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
		public static char pop() {
			if (top < 0) {
				// check status is stack overflow ?
				System.out.println("Stack Is Empty!!!");
				return '\0';
			} else {
				char c = arr[top--];
				System.out.println(c + " is Popped...");
				return c;
			}
		}

		// Stack Top Operation --> TC: O(1)
		public static char stackTop() {
			if (top != -1) {
				// System.out.println("Top Element Of Stack Is: " + arr[top]);
				return arr[top];
			} else
				return 0;
		}

		// function to check the char is operator or not?
		public static boolean isOperator(char ch) {
			if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
				return true;
			} else
				return false;
		}

		// associativity of a operator
		public static int associativity(char a) {
			if (a == '+' || a == '-') {
				return 1;
			} else if (a == '/' || a == '*') {
				return 2;
			} else
				return 0;
		}

		// function for conversion infix to postfix
		public static char[] infixToPostfixConversion(String str) {
			// p-q-r/a
			char crr[] = new char[size];
			int j = 0;

			for (int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);

				if (isOperator(temp)) {
					boolean b = true;
					while (b) {
						if (associativity(stackTop()) < associativity(temp)) {
							push(temp);
							b = false;
						} else {
							crr[j++] = pop();
						}
					}
				} else {
					crr[j++] = temp;
				}
			}
			while (top != -1) {
				crr[j++] = pop();

			}
			return crr;

		}

	}

	// Main Method
	public static void main(String[] args) {
		Stack st = new Stack();
		// give a valid expression
		String expression = "x-y/z-k*d";
		// get result from the function
		char[] infixToPostfixConversion = Stack.infixToPostfixConversion(expression);
		String infixToPostfixResult = "";
		for (int i = 0; i < infixToPostfixConversion.length; i++) {
			infixToPostfixResult += infixToPostfixConversion[i];
		}

		// print the result
		System.out.print("The Infix expression " + expression + " Is Converted To This Postfix expression: "
				+ infixToPostfixResult);

	}
}

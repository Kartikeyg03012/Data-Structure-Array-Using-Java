/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.stack;

public class MultipleParenthesisProblemUsingStack {
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
				//System.out.println(data + " Inserted Successfully...");
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
				//System.out.println(c + " is Popped...");
				return c;
			}
		}

		//Match The couple of parenthesis
		public static int matchValue(char a, char b) {
			if (a == '(' && b == ')') {
				return 1;
			} else if (a == '{' && b == '}') {
				return 1;
			} else if (a == '[' && b == ']') {
				return 1;
			}
			return -1;
		}

		public static int solveParenthesisProblem(String str) {
			for (int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);
				if (temp == '(' || temp == '{' || temp == '[') {
					push(temp);
				} else if (temp == ')' || temp == '}' || temp == ']') {
					if (checkStackStatus() == -1) {
						System.out.println("Not a Balanced Expression");
						return 0;
					} else {
						char ch = pop();
						if (matchValue(ch, temp) < 0) {
							System.out.println("Not a Balanced Expression");
							return 0;
						}
					}
				}
			}
			if (top < 0) {
				// check status is stack overflow ?
				System.out.println("Expression Is Balanced");
				return 1;
			} else {
				System.out.println("Not a Balanced Expression");
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "[{(1+3*6-5)}]+[(9-(-7)+8)]";
		st.solveParenthesisProblem(expression);

	}
}

/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.stack;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class StackUsingLinkedList {
	static Node top;

	// print the Linked List....
	// Traversal of a linked list --> TC: O(n)
	public static void showData(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	// ifEmpty Operation --> TC: O(1)
	public static void isEmpty() {
		if (top == null) {
			System.out.println("Stack Is Empty !!");
		} else {
			System.out.println("Stack Is Not Empty !!");
		}
	}

	// ifFull Operation --> TC: O(1)
	public static void isFull() {
		Node addData = new Node(1);
		if (addData == null) {
			System.out.println("Stack Overflow...");
		} else {
			System.out.println("Stack Is Not Full...");
		}
	}

	// Push operation --> TC: O(1)
	public static void push(int data) {
		Node addData = new Node(data);
		if (addData == null) {
			System.out.println("Stack Overflow...");
		} else {
			System.out.println(data + " Pushed Successfully");
			addData.next = top;
			top = addData;

		}
	}

	// Pop operation --> TC: O(1)
	public static void pop() {
		if (top == null) {
			System.out.println("Stack Is Empty !!");

		} else {
			System.out.println(top.data + " is Popped");
			top = top.next;
		}
	}

	// Peek Operation --> TC: O(n)
	public static void peek(int position) {
		Node temp = top;
		for (int i = 0; (i < position - 1 && temp != null); i++) {
			temp = temp.next;
		}
		if (temp != null) {
			System.out.println("At " + position + " Position In Stack, Value is: " + temp.data);
		} else {
			System.out.println("Invalid Position");
		}
	}

	// Stack Top Operation --> TC: O(1)
	public static void stackTop() {
		if (top != null) {
			System.out.println("Top Element Of Stack Is: " + top.data);
		} else {
			System.out.println("Not Found!!");
		}
	}

	// Stack Bottom Operation --> TC: O(n)
	public static void stackBottom() {
		if (top != null) {
			while (top.next != null) {
				top = top.next;
			}
			System.out.println("Bottom Element Of Stack Is: " + top.data);
		} else {
			System.out.println("Not Found!!");
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList sll = new StackUsingLinkedList();

		System.out.println("-----------Check Status Of Stack------------");
		isEmpty();
		System.out.println("-----------Stack Top Operation In Stack------------");
		stackTop();
		System.out.println("-----------Stack Bottom Operation In Stack------------");
		stackBottom();
		System.out.println("-----------Push Operations------------");
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		push(70);
		System.out.println("-----------Get All Elements In Stack ------------");
		showData(top);
		System.out.println("-----------Pop Operations------------");
		pop();
		pop();
		System.out.println("-----------Get All Elements In Stack ------------");
		showData(top);
		System.out.println("-----------Check Status Of Stack------------");
		isEmpty();
		System.out.println("-----------Peek Operation In Stack------------");
		peek(4);
		System.out.println("-----------Stack Top Operation In Stack------------");
		stackTop();
		System.out.println("-----------Stack Bottom Operation In Stack------------");
		stackBottom();
	}

}

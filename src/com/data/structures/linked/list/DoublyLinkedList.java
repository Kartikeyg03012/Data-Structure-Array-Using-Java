/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.linked.list;

public class DoublyLinkedList {

	static class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}

	}

	static Node head;

	// Doubly Linked List Traversal--> TC: O(n)
	public static void showData(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	// Doubly Linked List Print Data In Reverse Order--> TC: O(n)
	public static void showDataInreverse(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.head = new Node(10);
		Node two = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);

		head.next = two;
		two.next = third;
		two.prev = head;
		third.next = four;
		third.prev = two;
		four.prev = third;

		// Call Show Function
		System.out.println("----------Show All Data In Doubly Linked List-----------");
		showData(head);

		// Call Show Function, Print Data in Reverse order...
		System.out.println("----------Show All Data In Reverse Order In Doubly Linked List-----------");
		showDataInreverse(four);

	}
}

/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.linked.list;

public class CircularLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// circular Linked List Traversal--> TC:O(n)
	public static void showData(Node node) {
		do {
			System.out.println(node.data);
			node = node.next;
		} while (node != head);
	}

	// Insert Any Element At First
	public static Node insertAtFirst(Node node, int data) {
		Node addNode = new Node(data);
		while (node.next != head) {
			node = node.next;
		}
		addNode.next = node.next;
		node.next = addNode;
		head = addNode;
		return addNode;
	}

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.head = new Node(10);

		Node two = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);

		head.next = two;
		two.next = third;
		third.next = four;
		four.next = head;

		// Call Show Function
		System.out.println("----------Show All Data In Circular Linked List-----------");
		showData(head);

		// Call Insert Function
		System.out.println("----------Insert Data In Circular Linked List At Head-----------");
		Node insertAtFirst = insertAtFirst(head, 800);
		showData(insertAtFirst);
	}

}

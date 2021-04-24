/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.linked.list;


public class LinkedListDelete {

	// Linked List have contain multiple nodes......
	// two parameter one is data and another is address of next node
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Every LL has a starting Node called head.
	static Node head;

	// print the Linked List....
	// Traversal of a linked list
	public static void showData(Node head) {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	// Main Method....
	public static void main(String[] args) {
		LinkedListDelete ll = new LinkedListDelete();
		ll.head = new Node(10);
		// declare second node
		Node second = new Node(20);
		// declare third node and so on....
		Node third = new Node(30);
		Node four = new Node(40);
		Node five = new Node(50);
		Node six = new Node(60);
		// Link to the next Node....
		head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		five.next = six;

		// call showData function to print Data in LL...
		System.out.println("Show All Data In Linked List");
		showData(head);

	}

}

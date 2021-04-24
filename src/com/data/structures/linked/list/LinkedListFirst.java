/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.linked.list;

public class LinkedListFirst {

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

	// searching an element in LL.... -->TC:- O(n)
	public static int searchElement(Node head, int element) {
		Node n = head;
		while (n != null) {
			if (n.data == element) {
				System.out.println("Data Found");
				return 1;
			}
			n = n.next;
		}
		System.out.println("Not Found...");
		return -1;

	}

	// Main Method....
	public static void main(String[] args) {
		// make object of our public class not from java.util.*;
		LinkedListFirst ll = new LinkedListFirst();
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

		// create Divider....
		System.out.println("---------------------------------");
		// search element...
		System.out.println("Searching In Linked List");
		searchElement(head, 20);
		

	}

}

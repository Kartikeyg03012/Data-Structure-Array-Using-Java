/*Code By Kartikey Gupta
 * If you have any doubt free to ask...
 * you can ask in my GitHub discussion OR DM me on LinkedIn
 * https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
 * */

package com.data.structures.linked.list;

import com.data.structures.linked.list.LinkedListDelete.Node;

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

	// Case 1: Deleting the first element from the linked list --> TC: O(1)
	public static Node deleteFirstNode(Node node) {
		node=node.next;
		return node;
	}

	// Case 2: Deleting the element at a given value from the LL --> TC:O(n)
	public static Node deleteAtGivenValue(Node node, int value) {
		Node temp = node;
		while (temp != null) {

			if (temp.next.data == value) {
				temp.next = temp.next.next;
				return node;
			}
			temp = temp.next;
		}
		return node;
	}

	// Case 3: Deleting the last element --> TC: O(n)
	public static Node deleteTheLastNode(Node node) {
		Node dltNode = node;
		while (dltNode != null) {
			if (dltNode.next.next == null) {
				dltNode.next = null;
				return node;
			}
			dltNode = dltNode.next;
		}
		return dltNode;
	}

	// Case 4: Deleting the element at a given index from the LL --> TC:O(n)
	public static Node deleteAtGivenIndex(Node node, int index) {
		Node temp = node;
		Node dltNode = node.next;

		for (int i = 0; i < index - 1; i++) {
			dltNode = dltNode.next;
			temp = temp.next;
		}
		temp.next = dltNode.next;
		return node;
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

		// Show All Nodes...
		System.out.println("-----------Show All Nodes-----------");
		showData(head);

		// Case 1: Deleting the first element from the linked list
		System.out.println("-----------Deleting the first element-----------");
		Node deleteFirstNode = deleteFirstNode(head);
		// Show Data...
		showData(deleteFirstNode);

		// Case 2: Deleting the element at a given value from the linked list
		System.out.println("-----------Deleting the element at a given value-----------");
		Node deleteAtGivenValue = deleteAtGivenValue(head, 40);
		// Show Data
		showData(deleteAtGivenValue);

		// Case 3: Deleting the last element
		System.out.println("-----------Deleting the last element-----------");
		Node deleteTheLastNode = deleteTheLastNode(head);
		// Show Data --> here, 40 already deleted so that 40 is not present in ll.
		showData(deleteTheLastNode);

		// Case 4: Deleting the element at a given index from the linked list
		System.out.println("-----------Deleting the element at a given index-----------");
		Node deleteAtGivenIndex = deleteAtGivenIndex(head, 2);
		// Show Data, 30 deleted.... 40 And 60 deleted because of previous function...
		showData(deleteAtGivenIndex);
	}

}

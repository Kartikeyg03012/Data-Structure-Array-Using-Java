/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.linked.list;

public class LinkedListInsert {
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

	// here 4 cases are possible to insert Node in any linked list....
	/*
	 * Case 1: Insert at the beginning -->TC:- O(1)
	 * 
	 * Case 2: Insert in between -->TC:- O(n)
	 * 
	 * Case 3: Insert at the end -->TC:- O(n)
	 * 
	 * Case 4: Insert after the given node -->TC:- O(1)
	 */

	// Case 1: Insert at the beginning
	public static Node insertAtbeginning(int value, Node node) {
		Node node1 = new Node(value);
		node1.next = node;
		return node1;
	}

	// Case 2: Insert in between
	public static Node insertInBetween(int data, int valueAfter) {
		Node n = head;
		while (n != null) {
			if (n.data == valueAfter) {
				Node addNode = new Node(data);
				addNode.next = n.next;
				n.next = addNode;
				return head;
			}
			n = n.next;
		}

		return head;
	}

	// Case 3: Insert at the end
	public static Node insertAtEnd(int value, Node node) {
		Node n = node;
		while (n != null) {
			if (n.next == null) {
				Node addNode = new Node(value);
				n.next = addNode;
				return node;
			}
			n = n.next;
		}

		return node;
	}

	// Case 4: Insert after the given node
	public static Node insertAfterGivenNode(Node node, Node myNode, int value) {

		Node addNode = new Node(value);
		addNode.next = myNode.next;
		myNode.next = addNode;

		return node;
	}

	// Main Method.....
	public static void main(String[] args) {
		LinkedListInsert lid = new LinkedListInsert();
		lid.head = new Node(20);
		Node node1 = new Node(40);
		Node node2 = new Node(60);

		head.next = node1;
		node1.next = node2;

		// Case 1: Insert at the beginning
		System.out.println("-----------Insert at the beginning-----------");
		Node insertAtbeginning = insertAtbeginning(50, head);
		// show result
		showData(insertAtbeginning);

		// Case 2: Insert in between
		System.out.println("-----------Insert in between--------------");
		Node insertInBetween = insertInBetween(9000, 20);
		// show result, here node is add after the value of given node...
		showData(insertInBetween);

		// Case 3: Insert at the end
		System.out.println("-----------Insert at the End--------------");
		Node insertAtEnd = insertAtEnd(765, head);
		showData(insertAtEnd);

		// Case 4: Insert after the given node
		System.out.println("-----------Insert after the Given node--------------");
		Node insertAfterGivenNode = insertAfterGivenNode(head, node1, 87654);
		showData(insertAfterGivenNode);

	}

}

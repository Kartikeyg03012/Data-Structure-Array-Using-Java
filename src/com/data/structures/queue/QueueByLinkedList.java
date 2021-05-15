/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.queue;

public class QueueByLinkedList {
	static Node front = null;
	static Node rear = null;

	// Queue Is Empty or not -->TC: O(1)
	public static boolean isEmpty() {
		if (front == rear) {
			System.out.println("Queue Is Empty!!!");
			return true;
		} else {
			System.out.println("Queue Is Not Empty");
			return false;
		}
	}

	// Queue Is Full or not -->TC: O(1)
	public static boolean isFull() {
		Node node = new Node(20);
		if (node != null) {
			return false;
		} else {
			System.out.println("Queue Is Full");
			return true;
		}
	}

	// Queue Traversal -->TC: O(n)
	public static void queueTraversal(Node node) {
		System.out.println("Traversal All Elements From Queue ");
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	// Insert In Queue -->TC: O(1)
	public static void enQueue(int data) {
		if (!isFull()) {
			Node addNode = new Node(data);
			if (front == null) {
				front = rear = addNode;
			} else {
				rear.next = addNode;
				rear = addNode;
			}
			System.out.println(data + " Inserted SuccessFully....");
		} else
			System.out.println("Sorry, Queue Is Full!!");
	}

	// Remove Element From Queue -->TC: O(1)
	public static void deQueue() {
		if (isEmpty()) {

		} else {
			System.out.println(front.data + " Is Removed....");
			front = front.next;
		}
	}

	public static void main(String[] args) {
		System.out.println("------------------Check Queue Is Empty Or Not------------------");
		isEmpty();

		System.out.println("------------------Insert Element In Queue------------------");
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		enQueue(50);
		enQueue(60);
		enQueue(70);
		enQueue(80);
		System.out.println("------------------Check Queue Is Empty Or Not------------------");
		isEmpty();
		System.out.println("------------------Print All Element From Queue------------------");
		queueTraversal(front);
		System.out.println("------------------Delete Element From Queue------------------");
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		System.out.println("------------------Check Queue Is Empty Or Not------------------");
		isEmpty();
		System.out.println("------------------Print All Element From Queue------------------");
		queueTraversal(front);
		System.out.println("------------------Delete Element From Queue------------------");
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		System.out.println("------------------Check Queue Is Empty Or Not------------------");
		isEmpty();
		System.out.println("------------------Print All Element From Queue------------------");
		queueTraversal(front);
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;

	}
}

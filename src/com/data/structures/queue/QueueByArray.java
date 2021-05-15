/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.queue;

public class QueueByArray {
	static class Queue {
		static int size = 20;
		static int data;
		static int[] arr = new int[size];
		static int front;
		static int rear;

		Queue() {
			Queue.rear = 0;
			Queue.front = 0;
		}
	}

	// Queue Is Empty or not -->TC: O(1)
	public static boolean isEmpty(Queue addQueue) {
		if (addQueue.front == addQueue.rear) {
			System.out.println("Queue Is Empty");
			return true;
		} else {
			System.out.println("Queue Is Not Empty");
			return false;
		}
	}

	// Queue Is Full or not -->TC: O(1)
	public static boolean isFull(Queue addQueue) {
		if (addQueue.front == 0 && addQueue.rear == addQueue.size) {
			System.out.println("Queue Is Full");
			return true;
		} else {
			System.out.println("Queue Is Not Full");
			return false;
		}
	}

	// Insert In Queue -->TC: O(1)
	public static void enQueue(Queue addQueue, int data) {
		if (!isFull(addQueue)) {
			addQueue.arr[addQueue.rear] = data;
			addQueue.rear += 1;
			System.out.println(data + " is inserted");
		}
	}

	// Remove Element From Queue -->TC: O(1)
	public static void deQueue(Queue addQueue) {
		if (!isEmpty(addQueue)) {
			System.out.println(addQueue.arr[addQueue.front + 1]);
			addQueue.front += 1;
		}
	}

	// Queue Traversal -->TC: O(n)
	public static void showData(Queue addQueue) {
		if (!isEmpty(addQueue)) {
			int i = addQueue.front;
			while (i != addQueue.rear) {
				System.out.println(addQueue.arr[i]);
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println("*************************************************************");
		System.out.println("--------------------------QUEUE 1----------------------------");
		System.out.println("*************************************************************");

		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 10);
		enQueue(queue, 20);
		enQueue(queue, 30);
		enQueue(queue, 40);
		enQueue(queue, 50);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 60);
		enQueue(queue, 70);
		enQueue(queue, 80);
		enQueue(queue, 90);
		enQueue(queue, 100);
		enQueue(queue, 500);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 600);
		enQueue(queue, 700);
		enQueue(queue, 800);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue);

		System.out.println("*************************************************************");
		System.out.println("-------------------------QUEUE 2-----------------------------");
		System.out.println("*************************************************************");
		Queue queue2 = new Queue();
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue2, 11);
		enQueue(queue2, 21);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue2, 61);
		enQueue(queue2, 71);
		enQueue(queue2, 81);

		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue2);
		deQueue(queue2);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------EnQueue---------------");
		enQueue(queue2, 601);
		enQueue(queue2, 701);
		enQueue(queue2, 801);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue2);
		deQueue(queue2);
		deQueue(queue2);
		deQueue(queue2);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);
		System.out.println("---------------DeQueue---------------");
		deQueue(queue2);
		deQueue(queue2);
		System.out.println("---------------Show All Current Data ---------------");
		showData(queue2);

	}
}

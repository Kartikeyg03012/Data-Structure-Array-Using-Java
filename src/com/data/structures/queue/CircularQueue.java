/*Code By Kartikey Gupta
  If you have any doubt free to ask...
  you can ask in my GitHub discussion OR DM me on LinkedIn
  https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/
package com.data.structures.queue;

public class CircularQueue {
	static class Queue {
		int size = 10;
		int data;
		int[] arr = new int[size];
		int front;
		int rear;

		Queue() {
			this.rear = 0;
			this.front = 0;
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
	public static boolean isFull(Queue queue) {
		if ((queue.rear + 1) % queue.size == queue.front) {
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
			addQueue.rear = (addQueue.rear + 1) % addQueue.size;
			addQueue.arr[addQueue.rear] = data;
			System.out.println(data + " is inserted");
		}
	}

	// Remove Element From Queue -->TC: O(1)
	public static void deQueue(Queue addQueue) {
		if (!isEmpty(addQueue)) {
			addQueue.front = (addQueue.front + 1) % addQueue.size;
			System.out.println(addQueue.arr[addQueue.front]);

		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println("*************************************************************");
		System.out.println("--------------------------QUEUE 1----------------------------");
		System.out.println("*************************************************************");

		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 10);
		enQueue(queue, 20);
		enQueue(queue, 30);
		enQueue(queue, 40);
		enQueue(queue, 50);

		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 60);
		enQueue(queue, 70);
		enQueue(queue, 80);
		enQueue(queue, 90);
		enQueue(queue, 100);
		enQueue(queue, 500);

		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);

		System.out.println("---------------EnQueue---------------");
		enQueue(queue, 600);
		enQueue(queue, 700);
		enQueue(queue, 800);

		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);

		System.out.println("---------------DeQueue---------------");
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);
		deQueue(queue);

	}
}

/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.tree;

public class TreeByLinkedList {

	public static void main(String[] args) {
		Node root = new Node(10);
		Node c1 = new Node(2);
		Node c2 = new Node(3);

		root.left = c1;
		root.right = c2;
	}
}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

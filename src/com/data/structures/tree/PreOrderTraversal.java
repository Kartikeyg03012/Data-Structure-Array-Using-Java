/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.tree;

public class PreOrderTraversal {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void preOrderTraversal(Node n) {
		if (n != null) {
			System.out.println(n.data);
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		Node c1 = new Node(1);
		Node c2 = new Node(6);
		Node c3 = new Node(5);
		Node c4 = new Node(2);

		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		
		preOrderTraversal(root);
	}
}

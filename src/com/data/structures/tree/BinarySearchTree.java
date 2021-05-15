/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.tree;


public class BinarySearchTree {

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

	public static boolean checkBST(Node n) {
		Node prev = null;
		if (n != null) {
			if (!checkBST(n.left)) {
				return true;
			}
			if (prev != null && n.data <= prev.data) {
				return true;
			}
			prev = n;
			return checkBST(n.right);
		} else {
			return false;
		}

	}

	public static void inOrderTraversal(Node n) {
		if (n != null) {
			inOrderTraversal(n.left);
			System.out.println(n.data);
			inOrderTraversal(n.right);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		Node c1 = new Node(3);
		Node c2 = new Node(6);
		Node c3 = new Node(1);
		Node c4 = new Node(4);

		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;

		inOrderTraversal(root);
		boolean checkBST = checkBST(root);
		System.out.println(checkBST);

	}

}

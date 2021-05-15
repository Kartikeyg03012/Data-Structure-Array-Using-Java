/*Code By Kartikey Gupta
If you have any doubt free to ask...
you can ask in my GitHub discussion OR DM me on LinkedIn
https://www.linkedin.com/in/kartikey-gupta-015a56194/ 
*/

package com.data.structures.tree;

public class ItrSearchInBST {
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

	static int i = 0;

	public static Node itrSearchInBST(Node n, int value) {
		while (n != null) {
			if (value == n.data) {
				i=1;
			} else if (value < n.data) {
				n = n.left;
			} else {
				n = n.right;
			}
		}
		return null;
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

		Node itrSearchInBST = itrSearchInBST(root, 5);
		System.out.println(itrSearchInBST);
		
		if (i == 1)
			System.out.println("Value is Present");
		else
			System.out.println("Value is NOT Present");

	}
}

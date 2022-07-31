package com.greatlearning.service;

import com.greatlearning.model.Node;

public class Skewed {
	
	static Node prevNode = null;
	static Node headNode = null;
	
	/*
	 * Function to to flatten the binary search tree into a skewed tree in
	 * increasing order
	 */
	public static Node bTToSkewed(Node root) {

		// Base Case
		if (root == null) {
			return null;
		}

		bTToSkewed(root.left);
		Node rightNode = root.right;

		/*
		 * Condition to check if the root Node of the skewed tree is not defined
		 */
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		bTToSkewed(rightNode);
		return headNode;
	}


	
	/*
	 * Function to traverse the right skewed tree using recursion
	 */
	public static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

}

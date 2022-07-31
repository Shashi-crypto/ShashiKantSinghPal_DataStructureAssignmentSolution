package com.greatlearning.main;

import com.greatlearning.model.Node;
import com.greatlearning.service.Skewed;

/*
 * Java implementation to flatten the
 * binary search tree into a skewed
 * tree in increasing order
 *
 * Creating the class name as Main as per the instruction to hardcode the tree
 * as follows Main tree = new Main(); tree.node = new Node(50); tree.node.left =
 * new Node(30); tree.node.right = new Node(60); tree.node.left.left = new
 * Node(10); tree.node.right.left= new Node(55);
 */
class Main {
	static Node node;

	// Driver Code
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Node headNode = Skewed.bTToSkewed(node);
		Skewed.traverseRightSkewed(headNode);
	}
}
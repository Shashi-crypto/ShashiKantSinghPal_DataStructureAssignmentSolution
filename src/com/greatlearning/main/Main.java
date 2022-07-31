package com.greatlearning.main;

/*
 * Java implementation to flatten the
 * binary search tree into a skewed
 * tree in increasing order
 * Class of the node
 */
class Node {
	int val;
	Node left, right;

	/*
	 * Function that allocates a new node with the given data and NULL left and
	 * right pointers.
	 */
	Node(int item) {
		val = item;
		left = right = null;
	}
}

/*
 * Creating the class name as Main as per the instruction to hardcode the tree
 * as follows Main tree = new Main(); tree.node = new Node(50); tree.node.left =
 * new Node(30); tree.node.right = new Node(60); tree.node.left.left = new
 * Node(10); tree.node.right.left= new Node(55);
 */
class Main {
	static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	/*
	 * Function to to flatten the binary search tree into a skewed tree in
	 * increasing order
	 */
	static void bTToSkewed(Node root) {

		// Base Case
		if (root == null) {
			return;
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
	}

	/*
	 * Function to traverse the right skewed tree using recursion
	 */
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	// Driver Code
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		bTToSkewed(node);
		traverseRightSkewed(headNode);
	}
}
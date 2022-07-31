package com.greatlearning.model;

/* Class of the node
*/
public class Node {
	/*
	 * Making the elements as public to meet the Instructions to hardcode the tree
	 * 
	 * 
	 * tree.node = new Node(50); tree.node.left = new Node(30); tree.node.right =
	 * new Node(60); tree.node.left.left = new Node(10); tree.node.right.left= new
	 * Node(55);
	 * 
	 */
	public int val;
	public Node left;
	public Node right;

	/*
	 * allocates a new node with the given data and NULL left and right pointers.
	 */
	public Node(int item) {
		val = item;
		left = right = null;
	}
}
/**
 * 
 */
package com.coderioter.learn.algorithms.bst;

/**
 * @author shakeels
 *
 */
public class BinarySearchTree {

	private Node root;

	public void addNode(int data) {
		Node n = new Node();
		n.setData(data);

		if (root == null) {
			root = n;
		} else {
			Node currentNode = root;
			while (true) {
				if (currentNode.data > data) {
					if (currentNode.left == null) {
						currentNode.left = n;
						break;
					} currentNode = currentNode.left;
				}
				if(currentNode.data<data) {
					if(currentNode.right==null){
						currentNode.right=n;
						break;
					}
					currentNode = currentNode.right;
				}
			}
		}

	}

	private void printBinarySearchTree() {
		if(root!=null) {
			System.out.println("Inorder: ");
			printSubTreeInOrder(root);
			System.out.println("\nPreorder");
			printSubTreePreOrder(root);
			System.out.println("\npostorder");
			printSubTreePostOrder(root);
		}
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node n) {
		if(n==null) {
			return 0;
		}
		int l = height(n.left);
		int r = height(n.right);
		return Integer.max(l,r)+1;
	}
	
	private void printSubTreePreOrder(Node n) {
		System.out.print("\t "+n.data);
		if(n.left!=null) printSubTreePreOrder(n.left);
		if(n.right!=null) printSubTreePreOrder(n.right);
	}
	
	private void printSubTreeInOrder(Node n) {
		if(n.left!=null) printSubTreeInOrder(n.left);
		System.out.print("\t "+n.data);
		if(n.right!=null) printSubTreeInOrder(n.right);
	}
	
	private void printSubTreePostOrder(Node n) {
		if(n.left!=null) printSubTreePostOrder(n.left);
		if(n.right!=null) printSubTreePostOrder(n.right);
		System.out.print("\t "+n.data);
	}
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.addNode(5);
		b.addNode(1);
		b.addNode(4);
		b.addNode(3);
		b.addNode(7);
		b.addNode(8);
		b.addNode(2);
		b.addNode(6);
		b.addNode(9);
		b.printBinarySearchTree();
	}
}

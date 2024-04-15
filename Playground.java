import java.io.*;

// Java program for Inserting a node
class GFG {
	static class node {
		int value;
		node left, right;
	};

	static node newNode(int item) {
		node temp = new node();
		temp.value = item;
		temp.left = temp.right = null;
		return temp;
	}

	static node insert(node node, int value) {
		if (node == null)
			return newNode(value);
		if (value < node.value) {
			node.left = insert(node.left, value);
		} 
		else if (value > node.value) {
			node.right = insert(node.right, value);
		}
		inorder(node);
		System.out.println();
		return node;
	}

	static void delete(node node){

	}

	static void inorder(node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(" " + root.value);
			inorder(root.right);
		}
	}

	public static void main(String[] args) {
		node root = null;
		root = insert(root, 7);
		insert(root, 0);
		insert(root, 8);
		insert(root, 1);
		insert(root, 2);
		insert(root, 3);
		insert(root, 5);

		inorder(root);
	}
}
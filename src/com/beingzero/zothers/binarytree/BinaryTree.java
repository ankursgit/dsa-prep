package com.beingzero.zothers.binarytree;

import java.util.LinkedList;

public class BinaryTree {
	public static void main(String[] args) {
		Node root = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);
		Node n4 = new Node(50);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		
		//levelOrderTraversal(root);
		preorder(root);
		
	}
	public static void levelOrderTraversal(Node root) {
		LinkedList<Node> queue = new LinkedList<Node>();
		Node curr = null;
		queue.add(root);
		while(! queue.isEmpty())
		{
			curr = queue.poll();
			System.out.println(curr.data + ",");
			if(curr.left != null)
				queue.add(curr.left);
			if(curr.right != null)
				queue.add(curr.right);
			
		}
	}
	public static void inorder(Node node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	public static void preorder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
}

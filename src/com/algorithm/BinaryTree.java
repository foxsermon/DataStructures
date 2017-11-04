package com.algorithm;

public class BinaryTree {

	private int data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public final static void main(String args[]) {
		BinaryTree b = new BinaryTree(20);
		int[] nums = new int[] {34, 100, 200, 1, 23, 99, -100};
		for (int n : nums) {
			b.addNode(n);
		}
		b.traversePreOrder();
		System.out.println("--------------------------------");
		b.traverseInOder();
		System.out.println("--------------------------------");
		b.traversePostOrder();
	}
	
	public void addNode(int data) {
		if (data < this.data) {
			if (this.left != null) {
				this.left.addNode(data);
			}else {
				this.left = new BinaryTree(data);
			}
		}else {
			if (this.right != null) {
				this.right.addNode(data);
			}else {
				this.right = new BinaryTree(data);
			}
		}
	}
	
	public void traversePreOrder() {
		System.out.print(this.data + ", ");
		if (this.left != null) {
			this.left.traversePreOrder();
		}
		if (this.right != null) {
			this.right.traversePreOrder();
		}
	}
	
	public void traverseInOder() {
		if (this.left != null) {
			this.left.traverseInOder();
		}
		System.out.print(this.data + ", ");
		if (this.right != null) {
			this.right.traverseInOder();
		}
	}
	
	public void traversePostOrder() {
		if (this.left != null) {
			this.left.traversePostOrder();
		}if (this.right != null) {
			this.right.traversePostOrder();
		}
		System.out.print(this.data + ", ");
	}
}

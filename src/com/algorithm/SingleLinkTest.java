package com.algorithm;

import com.data.model.Node;

public class SingleLinkTest {

	private Node<Integer> start; 
	
	public void insertAtStart(Integer data) {
		Node<Integer> temp = new Node<Integer>(data);
		temp.link = start;
		start = temp;
	}
	
	public void insertAtEnd(Integer data) {
		Node<Integer> temp = new Node<Integer>(data);
		Node<Integer> p = start;
		if (start == null) {
			start = temp;
			return;
		}
		while (p.link != null) {
			p = p.link;
		}
		p.link = temp;
	}
	
	public void insertAfterXValue(Integer data, int x) {
		Node<Integer> p = start;
		while (p != null) {
			if (p.data == x) {
				break;
			}
			p = p.link;
		}
		if (p == null) {
			System.out.println(x + " not present in the list.");
		}else {
			Node<Integer> temp = new Node<Integer>(data);
			temp.link = p.link;
			p.link = temp;
		}
	}
	
	public void insertBeforeXValue(Integer data, int x) {
		Node<Integer> temp;
		if (start == null) {
			System.out.println("List is empty");
			return;
		}
		if (start.data == x) {
			temp = new Node<Integer>(data);
			temp.link = start;
			start = temp;
			return;
		}
		Node<Integer> p = start;
		while (p.link != null) {
			if (p.link.data == x) {
				break;
			}
			p = p.link;
		}
		if (p.link == null) {
			System.out.println(x + " not present in the list");
		}else {
			temp = new Node<Integer>(data);
			temp.link = p.link;
			p.link = temp;
		}
	}
	
	public void insertAtPosition(Integer data, int k) {
		Node<Integer> temp;
		int i;
		if (k == 1) {
			temp = new Node<Integer>(data);
			temp.link = start;
			start = temp;
			return;
		}
		Node<Integer> p = start;
		for (i = 1 ; i < k - 1 && p != null; i++) {
			p = p.link;
		}
		if (p == null) {
			System.out.println(k + " position not found");
		}else {
			temp = new Node<Integer>(data);
			temp.link = p.link;
			p.link = temp;
		}
	}
	
	public void deleteFirstNode() {
		if (start == null) {
			return;
		}
		start = start.link;
	}
	
	public void deleteLastNode() {
		if (start == null) {
			return;
		}
		if (start.link == null) {
			start = null;
			return;
		}
		Node<Integer> p = start;
		while (p.link.link != null) {
			p = p.link;
		}
		p.link = null;
	}
	
	public void deleteNode(Integer data) {
		if (start == null) {
			return;
		}
		if (start.data == data) {
			start = start.link;
			return;
		}
		Node<Integer> p = start;
		while (p.link != null) {
			if (p.link.data  == data) {
				break;
			}
			p = p.link;
		}
		if (p.link == null) {
			System.out.println("Element not in list");
		}else {
			p.link = p.link.link;
		}
	}
	
	public void reverseList() {
		Node<Integer> prev, p, next;
		prev = null;
		p = start;
		while (p != null) {
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		start = prev;
	}
	
	public void iterateLink() {
		Node<Integer> p = start;
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		SingleLinkTest link = new SingleLinkTest();
		link.insertAtStart(10);
		link.insertAtStart(15);
		link.insertAtStart(25);
		link.insertAtStart(35);
		link.iterateLink();
		
		link.insertAtEnd(5);
		link.iterateLink();
		
		link.insertAfterXValue(14, 5);
		link.iterateLink();
		
		link.insertBeforeXValue(30, 5);
		link.iterateLink();
		
		link.insertAtPosition(33, 3);
		link.iterateLink();
		
		link.deleteFirstNode();
		link.iterateLink();
		
		link.deleteLastNode();
		link.iterateLink();
		
		link.deleteNode(10);
		link.iterateLink();
		
		link.reverseList();
		link.iterateLink();
		System.out.println("C'est fini :)");
	}
}

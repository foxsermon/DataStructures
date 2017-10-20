package com.data.model;

public class Node<T> {

	public T data;
	public Node<T> link;
	
	public Node(T data) {
		this.data = data;
	}
}

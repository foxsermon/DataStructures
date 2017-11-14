package com.algorithm.recursive;

public class Fibo {

	public static void main(String[] args) {
		fibonacci(10);
	}

	public static void fibonacci(int n) {
		int n1=0, n2 = 1, n3 = 0;
		System.out.print(n1 + ", " + n2 + ", ");
		for (int x = 2; x<n; x++) {
			n3 = n1 + n2;
			System.out.print(n3 + ", ");
			n1 = n2;
			n2 = n3;
		}
	}
}

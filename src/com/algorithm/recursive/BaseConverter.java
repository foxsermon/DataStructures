package com.algorithm.recursive;

public class BaseConverter {

	public static void main(String[] args) {
		base2(13);
	}

	public static void base2(int n) {
		if (n == 0) {
			return;
		}
		int result = n / 2;
		base2(result);
		System.out.println(n % 2);
	}
}

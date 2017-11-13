package com.algorithm.recursive;

public class Factorial {

	public static void main(String[] args) {
		int resultado = fact(3);
		System.out.println("---------------------\n" + resultado);
	}
	
	public static int fact(int n) {
		if (n == 1) {
			System.out.println(n);
			return 1;
		}
		int result = fact(n - 1) * n;
		System.out.println(n);
		return result;
	}
}

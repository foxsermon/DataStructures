package com.algorithm.recursive;

public class Factorial {

	public static void main(String[] args) {
		int resultado = fact(30);
		System.out.println("---------------------\n" + resultado);
		
		System.out.println("************************");
		System.out.println(fact2(30));
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
	
	public static int fact2(int n) {
		int x = 0, fact = 1;
		for (x = n; x > 1; x--) {
			fact = fact * x;
		}
		return fact;
	}
}

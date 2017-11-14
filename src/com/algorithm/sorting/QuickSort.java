package com.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = new int[] {34, 21, 100, 32, 82, 1, 10, 78};
		quickSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(int[] a, int low, int high) {
		int middle = low + (high - low) / 2;
		int pivot = a[middle];
		int i = low, j = high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(a, low, j);
		}
		if (i < high) {
			quickSort(a, i, high);
			
		}
	}
}

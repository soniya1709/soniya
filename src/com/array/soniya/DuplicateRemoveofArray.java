package com.array.soniya;

import java.util.Arrays;

public class DuplicateRemoveofArray {
	public static int[] removeduplicate(int[] array) {
		int[] arr = new int[array.length - 1];
		int j = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {

				continue;// without continue system statement here and if statement !=;

			}
			System.out.println(array[i]);

		}

		array[j] = array[array.length - 1];
		System.out.println(array[j]);
		return arr;
	}

	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 7, 2, 3, 1, 4, 7 };
		Arrays.sort(num);
		removeduplicate(num);

	}
}

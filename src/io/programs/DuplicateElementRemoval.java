package io.programs;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementRemoval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		// System.out.println(Arrays.toString(array));

		int k = removeDuplicateElements(array);
		for (int i = 0; i < k; i++)
			System.out.print(array[i] + " ");

	}

	private static int removeDuplicateElements(int[] array) {
		int temp[] = new int[array.length];
		int k = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[k++] = array[i];
			}
		}

		temp[k++] = array[array.length - 1];

		for (int i = 0; i < k; i++) {
			array[i] = temp[i];
		}
		return k;
	}

}

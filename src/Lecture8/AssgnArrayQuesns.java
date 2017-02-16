package Lecture8;

import java.util.Scanner;

public class AssgnArrayQuesns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 3, 2, 3, 1, 4, 5, 6, 2, 7, 8, 9 };
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] brr = new int[n];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = s.nextInt();
		}
		int data = s.nextInt();
		System.out.println(find(brr, 0, data));
		System.out.println(firstIndex(brr, 0, data));
		System.out.println(lastIndex(arr, arr.length - 1, 2));
		int[] result = AllIndices(brr, 0, data, 0);
		for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
		}

	}

	public static boolean find(int[] arr, int si, int data) {

		if (si == arr.length) {
			return false;
		}
		if (arr[si] == data) {
			return true;

		} else
			return find(arr, si + 1, data);

	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (arr[si] == data)

		{
			return si;
		} else {
			return firstIndex(arr, si + 1, data);
		}

	}

	public static int lastIndex(int[] arr, int li, int data) {
		if (arr[li] == data) {
			return li;

		}

		else {
			return lastIndex(arr, li - 1, data);
		}

	}

	public static int[] AllIndices(int[] arr, int si, int data, int counter) {

		if (si == arr.length) {
			if (counter == 0) {
				int[] b = { -1 };
				return b;
			}
			return new int[counter];
		}
		int[] rv = null;
		if (arr[si] == data) {
			rv = AllIndices(arr, si + 1, data, counter + 1);
			rv[counter] = si;

		} else {
			rv = AllIndices(arr, si + 1, data, counter);
		}

		return rv;
	}

}

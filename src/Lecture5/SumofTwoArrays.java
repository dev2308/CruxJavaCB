package Lecture5;

import java.util.Scanner;

public class SumofTwoArrays {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);

		int size1 = s.nextInt();
		int arr[] = new int[size1];
		for (int i = 0; i < size1; i++) {
			arr[i] = s.nextInt();
		}
		int size2 = s.nextInt();
		int brr[] = new int[size2];
		for (int i = 0; i < size2; i++) {
			brr[i] = s.nextInt();
		}

		Calculatesum(arr, brr);

	}

	public static void Calculatesum(int[] arr, int[] brr) {

		int l = arr.length - 1;
		int j = brr.length - 1;
		int[] result = new int[((arr.length > brr.length) ? arr.length : brr.length)+1];
		int k = result.length - 1;
		int sum = 0;
		int carry = 0;
		while (k < result.length) {
			sum = carry;
			if (l >= 0)
				sum = sum + arr[l];

			if (j >= 0)
				sum = sum + brr[j];

			if (sum/10 != 0) {
				result[k] = sum % 10;
				carry = 1;
			} else {
				result[k] = sum;
				carry = 0;
			}
			l--;
			j--;
			k--;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.print("END");
	}

}

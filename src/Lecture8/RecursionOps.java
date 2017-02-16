package Lecture8;

import java.util.Scanner;

public class RecursionOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n = s.nextInt();
		int[] brr = new int[n];
		
		for (int i = 0; i < brr.length; i++) {
			brr[i] = s.nextInt();
		}

		PrintDec(num);
		System.out.println("****************************");
		PrintInc(num);
		System.out.println("****************************");
		PrintDecInc(num);
		System.out.println("****************************");
		PrintOddEven(num);
		System.out.println("****************************");
		System.out.println(factorial(num));
		System.out.println("****************************");
		System.out.println(power(2, 5));
		System.out.println("****************************");
		System.out.println(fib(10));
		System.out.println("****************************");
		
		System.out.println("****************************");
		int[] arr = { 1, 2, 3, 4, 789, 3, 2, 1, 99 };
		BubbleSort(arr, 0, arr.length - 1);
		display(arr);
		System.out.println();
		System.out.println("****************************");
		int[] crr = { 33, 11, -44, 66, 13, 8, 1 };
		SelectionSort(crr, 0, 1);
		display(crr);
		System.out.println("****************************");
		System.out.println(arrayIsPalindrome(arr, 0, arr.length - 1));
		System.out.println("****************************");
		reverseArrayRecursion(arr, 0, arr.length - 1);
		display(arr);
		System.out.println("****************************");
		System.out.println(maxArray(arr, 0));
		System.out.println("****************************");
		int[] krr = { 0, 1, 6, 3, 4, 2, 5 };
//		int[] inv = invertArrayRecursion(brr, 0);
//		display(inv);
		
		PrintPatternToBottom(5,1,1);
		PrintPatternToUp(5,1,1);

	}

	public static void PrintDec(int num) {
		if (num == 0)
			return;
		PrintDec(num - 1);
		System.out.println(num);
	}

	public static void PrintInc(int num) {
		if (num == 0)
			return;
		System.out.println(num);
		PrintInc(num - 1);
	}

	public static void PrintDecInc(int num) {
		if (num == 0)
			return;
		System.out.println(num);
		PrintDecInc(num - 1);
		System.out.println(num);
	}

	public static void PrintOddEven(int num) {
		if (num == 0)
			return;
		if (num % 2 != 0) {
			System.out.println(num);
			PrintOddEven(num - 1);
		} else {
			PrintOddEven(num - 1);
			System.out.println(num);
		}
	}

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		int fnm1 = factorial(num - 1);
		int fact = num * fnm1;

		return fact;

	}

	public static int power(int x, int n) {
		if (n == 0)
			return 1;
		int xpn1 = power(x, n - 1);
		int result = xpn1 * x;

		return result;

	}

	public static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		int fn1 = fib(n - 1);
		int fn2 = fib(n - 2);
		int result = fn1 + fn2;

		return result;

	}

	public static void PrintColumns(int cols, int col) {
		if (col == cols)
			return;
		System.out.println("*");
		PrintColumns(cols, col + 1);
	}

	public static void PrintRows(int rows, int row) {
		if (row > rows)
			return;
		System.out.println("*");
		PrintColumns(rows, row + 1);
	}

	public static void PrintPatternToBottom(int num, int rows, int cols) {
		if (rows > num)
			return;
		if (cols > rows) {
			System.out.println();
			PrintPatternToBottom(num, rows + 1, 1);
			return;
		}
		System.out.print("*");
		PrintPatternToBottom(num, rows, cols + 1);

	}

	
	public static void PrintPatternToUp(int num, int rows, int cols) {
		if (rows > num)
			return;
		if (cols > rows) {
			
			PrintPatternToUp(num, rows + 1, 1);
			System.out.println();
			return;
		}
		
		
		PrintPatternToUp(num, rows, cols + 1);
		System.out.print("*");


	}
	public static void display(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
 		System.out.println("}");
	}
	}

	public static void BubbleSort(int[] arr, int bi, int ei) {

		if (ei == 0) {
			return;
		}
		if (bi == ei) {
			BubbleSort(arr, 0, ei - 1);
			return;
		}
		if (arr[bi] > arr[bi + 1]) {
			int temp = arr[bi];
			arr[bi] = arr[bi + 1];
			arr[bi + 1] = temp;

		}
		BubbleSort(arr, bi + 1, ei);
	}

	public static void SelectionSort(int[] arr, int bi, int ei) {
		if (bi == arr.length - 1) {
			return;
		}
		if (ei == arr.length) {
			SelectionSort(arr, bi + 1, bi + 2);
			return;
		}
		if (arr[bi] > arr[ei]) {
			int temp = arr[bi];
			arr[bi] = arr[ei];
			arr[ei] = temp;

		}
		SelectionSort(arr, bi, ei + 1);
	}

	public static boolean arrayIsPalindrome(int arr[], int first, int last) {
		if (first >= last) {
			return true;
		}

		if (arr[first] == arr[last]) {
			return arrayIsPalindrome(arr, first + 1, last - 1);

		} else {
			return false;
		}

	}

	public static int[] reverseArrayRecursion(int[] arr, int first, int last) {
		if (first > last) {
			return arr;
		}
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
		return reverseArrayRecursion(arr, first + 1, last - 1);

	}

//	public static int[] invertArrayRecursion(int[] arr, int first) {
//
//		if (first == arr.length) {
//
//			return new int[arr.length];
//		}
//
//		int[] inv = null;
//		inv = invertArrayRecursion(arr, first + 1);
//		inv[arr[first]] = first;
//
//		return inv;
//
//	}

	static int max = 0;

	public static int maxArray(int[] arr, int si) {
		if (si == arr.length) {
			return max;
		}

		if (max < arr[si]) {
			max = arr[si];
		}
		return maxArray(arr, si + 1);

	}

}

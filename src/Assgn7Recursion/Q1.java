package Assgn7Recursion;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(sumOfDigits(str, 0));
	}

	public static int sumOfDigits(String str, int sum) {
		if (str.length() == 0) {
			return sum;
		}

		char dig = str.charAt(0);

		System.out.println(dig);
		sum = sum + dig;
		System.out.println(sum);
		String ros = str.substring(1);
		return sumOfDigits(ros, sum);

	}

}

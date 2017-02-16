package Lecture11;

import java.util.Scanner;

public class Assgn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(balancebracket(str));
	}

	public static boolean balancebracket(String str) {
		boolean flag = false;
		int j = str.length() - 1;
		int i = 0;
		while (i <= j) {
			if (str.charAt(i) == '[' && str.charAt(j) == ']') {
				i++;
				j--;

			} else if (str.charAt(i) == '(' && str.charAt(j) == ')') {
				i++;
				j--;
			} else if (str.charAt(i) == '{' && str.charAt(j) == '}') {
				i++;
				j--;
			}

			else if (str.charAt(i) == '[' && str.charAt(j) != ']') {
				return false;
			} else if (str.charAt(i) == '(' && str.charAt(j) != ')') {
				return false;
			} else if (str.charAt(i) == '{' && str.charAt(j) != '}') {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}
}

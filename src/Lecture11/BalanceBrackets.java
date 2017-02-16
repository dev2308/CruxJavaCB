package Lecture11;

import java.util.Scanner;

public class BalanceBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isBalanced(str, ""));
	}

	public static boolean isBalanced(String exp, String brackets) {

		if (exp.length() == 0) {
			if (brackets.length() == 0) {
				return true;
			} else {
				return false;
			}
		}

		char ch = exp.charAt(0);
		String ros = exp.substring(1);

		if ("[{(".indexOf(ch) != -1) {
			return isBalanced(ros, brackets + ch);

		}
		else if ("]})".indexOf(ch) != -1) {
			if (brackets.length() == 0) {
				return false;

			}
			char lb = brackets.charAt(brackets.length() - 1);
			if ("[{(".indexOf(lb) != "]})".indexOf(ch)) {
				return false;
			}

			else {
				return isBalanced(ros, brackets.substring(0, brackets.length() - 1));
			}
		} 
		else return isBalanced(ros, brackets);

	}
}

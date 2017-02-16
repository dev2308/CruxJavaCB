package Assgn7Recursion;

import java.util.Scanner;

public class checkRuleabba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		System.out.println(checkRule(str, str.length()));
	}

	public static boolean checkRule(String str, int length)

	{

		if (str.length() == 0) {
			return true;
		}

		if (str.charAt(0) != 'a' && str.length() == length) {
			return false;

		}
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);

		String ros1 = str.substring(1);
		String ros2 = str.substring(2);

		if (ch1 == 'a') {
			return checkRule(ros1, length);

		}

		else if (ch1 == 'b' && ch2 == 'b') {
			return checkRule(ros2, length);

		} else {
			return false;
		}

	}
}

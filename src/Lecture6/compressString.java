package Lecture6;

import java.util.Scanner;

public class compressString {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		compressString(str);

	}

	public static void compressString(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		int count = 1;

		while (i != s.length() - 1) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}

			else {

				sb.append(s.charAt(i));
				sb.append(count);
				count = 1;
			}
			i++;
		}
		sb.append(s.charAt(i));
		sb.append(count);

		System.out.println(sb);
	}
}

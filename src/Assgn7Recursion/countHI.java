package Assgn7Recursion;

import java.util.Scanner;

public class countHI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		countHi(str);
	}

	public static void countHi(String str) {
		StringBuilder sb = new StringBuilder(str);
		int i = 0;
		while (i != str.length()) {
			if (sb.charAt(i) == 'x') {
				char ch = sb.charAt(i);
				sb.deleteCharAt(i);
				sb.append(ch);
				System.out.println(sb);
			}
		   i++;
		}
		
		System.out.println(sb);
	}

}

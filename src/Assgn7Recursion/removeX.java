package Assgn7Recursion;

import java.util.Scanner;

public class removeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		removeX(str);
	}

	public static void removeX(String str) {
		StringBuilder sb = new StringBuilder(str);
		int i = 0;
		while (i != str.length()) {
			if (str.charAt(i) == 'x') {
				char ch = str.charAt(i);
				sb.deleteCharAt(i);
				sb.append(ch);
				System.out.println(sb);
			}
		   i++;
		}
		
		System.out.println(sb);
	}

}

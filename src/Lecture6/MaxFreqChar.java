package Lecture6;

import java.util.Scanner;

public class MaxFreqChar {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = maxFreqChar(str);
		System.out.println(ch);

	}

	public static char maxFreqChar(String s) {

		int i = 0, j = 0;
		int count = 1;
		int max = 0;
		char ch = s.charAt(i);
		while (i != s.length() - 1) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			else
			{
				i++;
			}
			
			if (count > max) {
				max = count;
				count = 0;
				char c = s.charAt(i-1);
				j=i-1;
			}
			

		}

		if (max == 0) {
			return s.charAt(0);
		} else {
			return s.charAt(j);
		}
	}

}

package Lecture11;

import java.util.Scanner;

public class StringBWBrckets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(stringbwbrckets(str));
	}

	public static String stringbwbrckets(String str) {
		int i = 0;
		String s = "";
		int j = str.length() - 1;

		while (i <= j) {
			if (str.charAt(i) == '(' && str.charAt(j) == ')') {
				s = str.substring(i+1, j);
				return s;
			}

			i++;
			j--;
		}
		return s;
	}

}

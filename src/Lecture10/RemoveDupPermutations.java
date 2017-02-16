package Lecture10;

import java.util.Scanner;

public class RemoveDupPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		RemoveDuplicatePermutations("aaab", "");
		System.out.println("***********************************");
		printAllPermutations(str, "");
		System.out.println("***********************************");
		printSubSequences(str, "");

	}

	public static void RemoveDuplicatePermutations(String que, String ans) {

		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] darr = new boolean[26];
		for (int i = 0; i < que.length(); i++) {
			char ch = que.charAt(i);
			if (darr[ch - 'a'] != true) {
				String ros = que.substring(0, i) + que.substring(i + 1);
				RemoveDuplicatePermutations(ros, ans + ch);
			}
			darr[ch - 'a'] = true;

		}

	}

	public static void printSubSequences(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		
			char ch = que.charAt(0);

			String ros = que.substring(1);
			printSubSequences(ros, ans + "");
			printSubSequences(ros, ans + ch);
		}

	

	public static void printAllPermutations(String que, String ans) {
		
	
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = que.length()-1; i>=0; i--) {
			char ch = que.charAt(i);

			String ros = que.substring(0, i) + que.substring(i + 1);
			printAllPermutations(ros, ans + ch);
		}
	}

}
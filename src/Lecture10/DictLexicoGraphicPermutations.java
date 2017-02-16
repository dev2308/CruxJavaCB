package Lecture10;

import java.util.Scanner;

public class DictLexicoGraphicPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		getDictLexicoPermutations(str, "", false);
		getDictLexicoPermutations(str,"", false);

	}

	public static void getDictLexicoPermutations(String que, String ans, boolean flag) {

		if (que.length() == 0) {
			if (flag) {
				
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < que.length(); i++) {

			char ch = que.charAt(i);
			String ros = que.substring(0, i) + que.substring(i + 1);

			if (!flag) {

				if (ch > que.charAt(0)) {
					getDictLexicoPermutations(ros, ans + ch, true);
				}

				else if (ch == que.charAt(0)) {
					getDictLexicoPermutations(ros, ans + ch, flag);
				} else {

				}
			}

			else {
				getDictLexicoPermutations(ros, ans + ch, true);
			}
		}
	}
	
	public static void getDictLexicoPermutationsbyComparing(String que, String ans,String os) {

		if (que.length() == 0) {
			if (ans.compareTo(os)>0) {
				
				System.out.println(ans);
			}
			return;
		}

		for (int i = 0; i < que.length(); i++) {

			char ch = que.charAt(i);
			String ros = que.substring(0, i) + que.substring(i + 1);

			

				if (ch > que.charAt(0)) {
					getDictLexicoPermutationsbyComparing(ros, ans + ch,os);
				}

				else if (ch == que.charAt(0)) {
					getDictLexicoPermutationsbyComparing(ros, ans + ch,os);
				} else {

				}

		}
	}
}

package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printAllChars(str);
		System.out.println("***************************************");
		allSubstrings(str);
		System.out.println("***************************************");
		boolean flag = isPalindrome(str);
		System.out.println(flag);
		System.out.println("***************************************");
		int n = numberOfSubstringsPalindrome(str);
		System.out.println(n);
		System.out.println("***************************************");
		String str1 = removeAllDuplicates(str);
		System.out.println(str1);
		System.out.println("***************************************");
		char ch = maxFrequency(str);
		System.out.println(ch);

	}

	public static void printAllChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void allSubstrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String sub = str.substring(i, j + 1);
				System.out.println(sub);

			}
			System.out.println();
		}
	}

	public static boolean isPalindrome(String str) {
		int l = 0;
		int r = str.length() - 1;

		while (l <= r) {
			if (str.charAt(l) != str.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}

	public static int numberOfSubstringsPalindrome(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String sub = str.substring(i, j + 1);
				boolean flag = isPalindrome(sub);
				if (flag) {
					count++;
				}

			}
		}
		return count;
	}

	public static String removeAllDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i));

			}

		}
		return sb.toString();
	}

	public static char maxFrequency(String str) {

		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String sortedstr = new String(charArray);
		StringBuilder sb = new StringBuilder(sortedstr);
		
		int[] count = new int[str.length()];
		int j = 0;

		for (int i = 0; i < sb.length(); i++) {

			
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				count[j]++;
			} else {
				j++;
			}
			i++;
		}
		int maxF =count[0];;
		int maxI =0;
		for(int i =1;i<=j;i++)
		{
			
			if(count[i]>maxF)
				{maxF=count[i];
			    maxI=i;
				}
			
		}

		return (char)(maxI + 65) ;
	}

	public static String FrequencyOfChars(String str) {
		StringBuilder sb = new StringBuilder();

		return sb.toString();
	}

}

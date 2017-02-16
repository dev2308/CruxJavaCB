package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ArrayList<String> finResult = getPermutations(str);
		System.out.println(finResult);
	}
		

	public static ArrayList<String> getPermutations(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getPermutations(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < recResult.size(); i++) {
			String recString= recResult.get(i);
			for(int j = 0;j<=recString.length();j++)
			{
				String myString  =  recString.substring(0,j)+ch+recString.substring(j);
				myResult.add(myString);			
			}

		}
		return myResult;
	}

}

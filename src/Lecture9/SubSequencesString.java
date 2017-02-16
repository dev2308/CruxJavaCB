package Lecture9;

import java.util.ArrayList;
import java.util.Scanner;



public class SubSequencesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = s.nextLine();
		ArrayList<String> finResult = getSS(str);
		System.out.println(finResult);
		System.out.println(finResult.size());

		System.out.println("********************************");
		finResult = getSSWAscii(str);
		System.out.println(finResult);
		System.out.println(finResult.size());

		System.out.println("********************************");
		finResult = getCodedSS(str1);
		System.out.println(finResult);
		System.out.println(finResult.size());

	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSS(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add("" + recResult.get(i));
			myResult.add(ch + recResult.get(i));

		}
		return myResult;
	}

	public static ArrayList<String> getSSWAscii(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSSWAscii(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add("" + recResult.get(i));
			myResult.add(ch + recResult.get(i));
			myResult.add((int)ch + recResult.get(i));

		}
		return myResult;
	}

	public static ArrayList<String> getCodedSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getCodedSS(ros);
		ArrayList<String> myResult = new ArrayList<>();
		String codedStr = getCode(ch);

		for (int i = 0; i < recResult.size(); i++) {
			String receivedStr = recResult.get(i);
			for (int j = 0; j < codedStr.length(); j++)
				myResult.add(codedStr.charAt(j) + receivedStr);

		}
		return myResult;
	}

	public static String getCode(char ch)
	{
		
		
		String str=new String();
		switch(ch)
		{
		case '0' :  str=".:";
		         break;
		case '1' :  str ="abc";
                 break;
		case '2' :  str="def";
                   break;
		case '3' : str="ghi";
                  break;
		case '4' : str="jkl";
                  break;
		case '5' : str="mno";
        			break;
		case '6' : str="pqr";
        			break;
		case '7' :  str="stu";
        			break;
		case '8' :  str="vwx";
        			break;
		case '9' : str="yz";
        			break;
        default:  
                   break;
		}
		return str;
	}

}

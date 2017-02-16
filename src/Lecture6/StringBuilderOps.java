package Lecture6;

import java.util.Scanner;

public class StringBuilderOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String toggle=togglechars(str);
		System.out.println(toggle);
		System.out.println("************");
		String next=nextChar(str);
		System.out.println(next);
		System.out.println("************");
		String diff = charDifference(str);
		System.out.println(diff);
		System.out.println(numberOfSubstrings(str));
		

	}
	
	public static String togglechars(String str){
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<str.length();i++)
		{ char ch = str.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			char conv = (char)(ch-'A'+'a');
			sb.append(conv);
		}
		if(ch>='a'&&ch<='z')
		{
			char conv = (char)(ch+'A'-'a');
			sb.append(conv);
		}
	}
		return sb.toString();
	}
	
	public static String nextChar(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<str.length();i++)
		{
			if(i%2==0)
			{
				char ch = str.charAt(i);
				ch=(char)(ch+1);
				sb.append(ch);
				
			}
			else
			{
				char ch = str.charAt(i);
				ch=(char)(ch-1);
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	public static String charDifference(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<str.length()-1;i++)
		{
			
		
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(i+1);
				int d = ch2-ch1;
                sb.append(ch1);
                sb.append(d);
                if(i==str.length()-2)
                {
                	sb.append(ch2);
                }

			
		}
		return sb.toString();
	}
	
	public static int numberOfSubstrings(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <str.length(); j++) {
				if(i==0&&j==str.length()-1)
					continue;
				count++;
				String sub = str.substring(i, j + 1);
				System.out.println(sub);
				
			}
		}
		return count;
	}
	
	

}

package Lecture13;

import java.util.Scanner;

public class CountPalindromicSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(CountPalindromicSS(str));

	}
	
	public static int CountPalindromicSS(String str)
	{
		int count = 0;
//		odd length
		for(int axis=0;axis<str.length();axis++)
		{
			for(int orbit = 0;axis-orbit>0&&axis+orbit<str.length();orbit++)
			{
				if(str.charAt(axis-orbit)==str.charAt(axis+orbit))
				{
					count++;
				}
				else
				{
					break;
				}
			}
		}
//		even length
		for(int axis=1;axis<=str.length()-1;axis++)
		{
			for(int orbit = 1;axis-orbit>=0&&axis+orbit-1<str.length();orbit++)
			{
				if(str.charAt(axis-orbit)==str.charAt(axis+orbit-1))
				{
					count++;
				}
				else
				{
					break;
				}
			}
		}
		
		return count;
	}

}

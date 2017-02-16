package Assgn7Recursion;

import java.util.Scanner;

public class isPalindromeRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isPalindrome(str));
		s.close();
	}
	
	public static boolean isPalindrome(String str)
	{
		
		if(str.length()==1 || str.length()==0)
		{
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			return isPalindrome(str.substring(1,str.length()-1));
		}
		else
		{
			return false;
		}
		
		
		
		
	}

}

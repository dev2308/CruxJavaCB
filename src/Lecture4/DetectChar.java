package Lecture4;

import java.util.Scanner;

public class DetectChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		categorizechars(ch);
	}
	
	public static void categorizechars(char ch)
	{
		if(ch>='A' && ch<='Z')
		{
			System.out.println("U");
		}
		
		else if(ch>='a' && ch<='z')
		{
			System.out.println("L");
		}
		
		else
		{
			System.out.println("I");
		}
	}

}

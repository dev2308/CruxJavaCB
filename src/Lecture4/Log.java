package Lecture4;

import java.util.Scanner;

public class Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int base = s.nextInt();
		int number=s.nextInt();
		
		double log = calLog(number,base);
		System.out.println(log);
		
		

	}
	public static double calLog(int number, int base)
	{
		double a= Math.log(number);
		double b = Math.log(base);
		double c=a/b;
		return Math.round(c);
	}
	

}

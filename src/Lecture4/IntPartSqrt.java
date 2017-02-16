package Lecture4;

import java.util.Scanner;

public class IntPartSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int result = SqrtIntPart(n);
		System.out.println("The Integral Part Of the Square Root of the number is "+result);
		

	}
	
	public static int SqrtIntPart(int n)
	{
		double res = (Math.sqrt(n));
		System.out.println(res);
		int r= (int)res;
		return r;
	}

}

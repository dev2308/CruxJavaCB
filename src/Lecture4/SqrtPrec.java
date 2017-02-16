package Lecture4;

import java.util.Scanner;

public class SqrtPrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int prec = scn.nextInt();
		
		double sqrt = Math.sqrt(num);
		
		int n= (int)(sqrt*Math.pow(10, prec));
		
		float pSqrt =(float) (n*Math.pow(10,-prec));

		System.out.println(pSqrt);

	}

}

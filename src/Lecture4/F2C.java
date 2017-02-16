package Lecture4;

import java.util.Scanner;

public class F2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the minFarenheit");
		int minF= s.nextInt();
		
		System.out.println("enter the maxFarenheit");
		int maxF= s.nextInt();
		
		System.out.println("enter the step");
		int step= s.nextInt();
		
		int farht=minF,cel=0;
		while(farht<=maxF)
		{
			cel= (int)(5.0/9 * (farht-32));
			System.out.println(farht + " " + cel);
			farht = farht + step;
			
		}
		s.close();
	}

}

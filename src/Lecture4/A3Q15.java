package Lecture4;

import java.util.Scanner;

public class A3Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		int i =0;
		while(i<=n1)
		{
			int num = 3*i+2;
			if(num%n2!=0)
			{
				System.out.println(num);
			}
			i++;
		}

	}

}

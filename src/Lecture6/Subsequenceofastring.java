package Lecture6;

import java.util.*;

public class Subsequenceofastring {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		subSequence(str);

	}

	public static void subSequence(String str) {
		int number = ((int) Math.pow(2, str.length()));

		int num = 1;
		
		System.out.println("[]");
		
		while (num!= number) {
			int rem = 0, bin = 0,i=0,num2=num;
			while (num2 != 0) {
				rem = num2 % 2;
				bin = bin + ((int) (Math.pow(10, i)) )* rem;
//				System.out.println("*****************************");
//				System.out.println(bin);
//				System.out.println("*****************************");
				num2 = num2 / 2;
				i++;
			}
			int j = 0;
			StringBuilder sb = new StringBuilder("[");
			while (bin != 0) {
//				System.out.println("*****************************");
//				System.out.println(bin);
				if (bin % 10 == 1) {
					sb.append(str.charAt(j)+", ");

				}
				
				j++;
				bin = bin / 10;
				System.out.println(bin);
				System.out.println("*****************************");
				
			}
			sb.deleteCharAt(sb.lastIndexOf(","));
			sb.deleteCharAt(sb.lastIndexOf(" "));
			sb.append("]");
			System.out.println(sb);
			num++;
		}

	}
}
package Lecture4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		char ch = '\0';
		int n1 = 0, n2 = 0;

		// Write your code here.
		ch = scn.next().charAt(0);
		while (ch != 'X' && ch != 'x') {
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				n1 = scn.nextInt();
				n2 = scn.nextInt();
				switch (ch) {

				case '+':
					int add = n1 + n2;
					System.out.println(add);
					break;
				case '-':
					int sub = n1 - n2;
					System.out.println(sub);
					break;
				case '*':
					int mul = n1 * n2;
					System.out.println(mul);
					break;
				case '/':
					int div = n1 / n2;
					System.out.println(div);
					break;
				case '%':
					int rem = n1 % n2;
					System.out.println(rem);
					break;

				}
			}
			if (ch != '+' && ch != '-' && ch != '*' && ch != '%' && ch != '/' && ch != 'x' && ch != 'X') {
				System.out.println("Invalid operation. Try again.");
			}
			ch = scn.next().charAt(0);

		}

		System.exit(0);
	}

}

package Lecture11;

import java.util.Scanner;

public class NumbersInLexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int n = s.nextInt();

		getNumbersInLexico(c, n);
	}

	public static void getNumbersInLexico(int c, int n) {
		if (c > n) {
			return;
		}
	
			System.out.println(c);

			{
				if (c != 0) {
					for (int j = 0; j <= 9; j++)

					{
						getNumbersInLexico((10 * c) + j, n);
					}
				} 
				else {
					for (int j = 1; j <= 9; j++) {
						getNumbersInLexico((10 * c) + j, n);
					}
				}
			}
		}
	
}

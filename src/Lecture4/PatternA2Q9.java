package Lecture4;

import java.util.Scanner;

public class PatternA2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 0;

		while (row < n) {
			int col = 0, val = 1;
			while (col <= row)
			{
				System.out.print(val + "\t");
				val = (val * (row - col)) / (col + 1);
				col++;
			}
			row++;
			System.out.println();
		}
		

	}

}

package Lecture4;

import java.util.Scanner;

public class A3Q19Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of inputs in the sequence");
		int n = s.nextInt();

		int prev = s.nextInt();
		int i = 1, x = 1;
		boolean flag = true;

		while (i < n) {

			int curr = s.nextInt();

			if (curr <= prev && x == 1) {
				i++;
				prev = curr;
			}

			else {
				x = 0;
				if (curr >= prev) {
					i++;
					prev = curr;
				} else {
					flag = false;
					break;
				}
			}

		}
		System.out.println(flag);

	}

}

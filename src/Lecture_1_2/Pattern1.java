import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of rows");
		int n = s.nextInt();
		int row = 1, val = 1;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print(val++ + " ");
				col++;
			}
			System.out.println();
			row++;
		}

	}

}

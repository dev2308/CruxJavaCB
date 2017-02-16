import java.util.Scanner;

public class PatternA2Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of rows");
		int n = s.nextInt();
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= (n - row)) {
				System.out.print(" " + "\t");
				col++;
			}
			col = row;
			while (col <= 2 * row - 1) {
				System.out.print(col++ + "\t");

			}

			col = 2 * row - 2;
			while (col >= row) {
				System.out.print(col-- + "\t");

			}

			row++;
			System.out.println();
		}

		

	}

}

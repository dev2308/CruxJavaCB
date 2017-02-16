import java.util.Scanner;

public class PatternA2Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int r = 1, f1 = 0, f2 = 1, f3 = 1;
		while (r <= n) {
			int i = 1;
			while (i <= r) {
				if (r == 1 && i == 1) {
					System.out.print("0");
					i++;
					continue;
				}
				System.out.print(f3 + "\t");

				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
				i++;
			}
			r++;
			System.out.println();

		}
	}

}

import java.util.Scanner;

public class AllPrimesuptoN {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number upto which you want the prime numbers");
		int n = s.nextInt();
		for (int i = 2; i <= n; i++) {
			int j = 2;
			int flag = 0;
			while (j <= Math.sqrt(i)) {

				if (i % j == 0) {
					flag = 1;
					break;
				}
				j++;

			}
			if (flag == 0) {
				System.out.print("  "+i);
			}
		}
	}

}

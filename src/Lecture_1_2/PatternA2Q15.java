import java.util.Scanner;

public class PatternA2Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();

		int r = 1;

		while (r <= n) {
			int i = 1;
			
			while (i <= r) {
				System.out.print(i++ + "\t");
			}

			i = 1;
			while (i <= (2 * n - 1 - 2 * r)) {
				System.out.print("\t");
				i++;
			}

			if(r!=n)
			i = r;
			else 
			i = r-1;
			while (i >= 1) {
				System.out.print(i-- + "\t");
			}
			
			r++;
			System.out.println();

		}
	}

}

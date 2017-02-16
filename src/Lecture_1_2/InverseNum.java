import java.util.Scanner;

public class InverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number");
		int n = s.nextInt();
		int inverse = InvNum(n);
		System.out.println(inverse);
		
		s.close();

	}
	
	public static int InvNum(int n)
	{
		int count = 1, rem = 0, inverse = 0;
		while (n != 0) {
			rem = n % 10;
			int current = (int) (count * (Math.pow(10, rem - 1)));
			inverse += current;
			count++;
			n = n / 10;
		}
		return inverse;
	}
}

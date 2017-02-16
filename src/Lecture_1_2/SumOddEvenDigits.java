import java.util.Scanner;

public class SumOddEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number");
		int n = s.nextInt();
		
		int sumEven=0,sumOdd=0,digit=0,i=1;
		while (n!=0)
		{
			digit=n%10;
			if(i%2==0)
			{
				sumEven=sumEven+digit;
			}
			else
				sumOdd=sumOdd+digit;
			n=n/10;
			i++;
		}
		System.out.println("The sum of digits at even places is " + sumOdd);
		System.out.println("The sum of digits at odd places  is " + sumEven);

	}

}

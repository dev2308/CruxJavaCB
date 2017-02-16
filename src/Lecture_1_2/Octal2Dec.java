import java.util.Scanner;

public class Octal2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter an octal number");
		int n = s.nextInt();
		int dec =0,pos=0;;
		while(n!=0)
		{
			int rem=n%10;
			int decdigit= (int) (rem* Math.pow(8,pos++));
			dec+=decdigit;
			n=n/10;
		}
		System.out.println("the decimal equivalent of the binary number is" + dec);

	}

}

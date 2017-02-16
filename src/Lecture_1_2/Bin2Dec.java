import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a binary number");
		int n = s.nextInt();
		int dec = Bin2DecFUn(n);
		System.out.println("the decimal equivalent of the binary number is" + dec);

	}
	
	public static int Bin2DecFUn(int n)
	{
		int dec =0,pos=0;
		while(n!=0)
		{
			int rem=n%10;
			int decdigit= (int) (rem* Math.pow(2,pos++));
			dec+=decdigit;
			n=n/10;
		}
		return dec;
	}

}

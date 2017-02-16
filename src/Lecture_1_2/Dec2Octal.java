import java.util.Scanner;

public class Dec2Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the decimal number");
		int n = s.nextInt();
		int decnum = Dec2Oct(n);
		System.out.print(decnum);

	}
	
	public static int Dec2Oct(int n){
		int pos=0,decnum=0;
		while(n!=0)
		{
			int rem = n%8;
			int dig = (int) (rem*Math.pow(10,pos++));
			decnum+=dig;
			
		    n=n/8;
		}
		return decnum;
	}

}

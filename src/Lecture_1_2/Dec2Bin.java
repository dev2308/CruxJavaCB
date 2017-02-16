import java.util.Scanner;

public class Dec2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a decimal number");
		int n = s.nextInt();
		int binnum = Dec2BinFun(n);
		System.out.print(binnum);

	}
	
	public static int Dec2BinFun(int n){
		int pos=0,binnum=0;
		while(n!=0)
		{
			int rem = n%2;
			int dig = (int) (rem*Math.pow(10,pos++));
			binnum+=dig;
			
		    n=n/2;
		}
		return binnum;
	}

}

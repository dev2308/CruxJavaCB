import java.util.Scanner;

public class AnyBasetoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the source number,source base and the destination base");
		int src = s.nextInt();
		int sbase = s.nextInt();
		int dbase = s.nextInt();
		int dec= Any2Dec(src, sbase);
		int num = Dec2Any(dec, dbase);
		System.out.print("the destination number for the required base is" + num);

	}
	
	public static int Any2Dec(int src,int sbase)
	{
		int decnum = 0, num = 0, dig = 0, pos = 0;
		while (src != 0) {
			int rem = src % 10;
			dig = (int) (rem * Math.pow(sbase, pos++));
			decnum += dig;

			src = src / 10;

		}
		return decnum;
	}
	
	public static int Dec2Any(int dec,int dbase)
	{
		int position = 0,decnum=0,num=0;
		while (decnum != 0) {
			int rem = decnum % dbase;
			int digit = (int) (rem * Math.pow(10, position++));
			num += digit;
			decnum = decnum / dbase;
		}
		return num;
	}

}

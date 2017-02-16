package Lecture13;

public class PowerLogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(PowerinLogn(2,5));

	}

	public static int PowerinLogn(int x ,int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		int xpn2 = PowerinLogn(x, n/2);
		
		if(n%2==0)
		{
			return xpn2*xpn2;
			
		}
		else
		{
			return xpn2*xpn2*x;
		}
	}

}

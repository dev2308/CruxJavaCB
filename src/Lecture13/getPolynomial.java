package Lecture13;

public class getPolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getPoly(2,3));
	}

	
	public static int getPoly(int x,int n ){
		int temp = n;
		int result=0;
		int value = (int)(Math.pow(x,n));
		for(int i =1;i<=n;i++)
		{
			result+=i*value;
			value=value/x;
			
			
		}
		return result;
	}
}

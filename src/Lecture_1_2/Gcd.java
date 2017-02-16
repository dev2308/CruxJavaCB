import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("Enter 2 numbers of which gcd is to be calculated");
      
      Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2= s.nextInt();
      
      int gcd = Calgcd(n1,n2);
      System.out.println("the gcd of the given 2 numbers is" + gcd);

	}
	public static int Calgcd(int n1,int n2)
	{
		while(n1%n2!=0)
	      {
	    	  int rem=n1%n2;
	    	  n1=n2;
	    	  n2=rem;
	      }
		return n2;
	}

}

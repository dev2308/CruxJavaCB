import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int n = s.nextInt();
        int rem=0,rev=0,i=10;		
        while (n!=0)
		{
			rem= n%i;
			rev=rev*10+rem;
			n=n/10;
		}
        System.out.println("The reverse of the number is " + rev);

	}

}

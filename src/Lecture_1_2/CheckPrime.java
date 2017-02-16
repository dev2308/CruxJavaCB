import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int n = s.nextInt();
		int counter = 2;
		
		while(counter<=Math.sqrt(n))
		{
		if(n%counter==0)
		{
			System.out.println(n +" is not a prime number");
			return;
		}
	
			counter++;
		}
		
		System.out.println(n+" is a prime number");}
	

}

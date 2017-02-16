import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter  Base number and the power ");
		

		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int pow = s.nextInt();
		int i = 1,res=1;
		
		while(i<=pow)
		{
			res=res*number;
			i++;
			
		}
		System.out.println("The result of "+number+"to the power "+ pow+"is"+res);
		

	}

}

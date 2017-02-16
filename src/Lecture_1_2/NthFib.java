import java.util.Scanner;

public class NthFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int n = s.nextInt();
		int f1=0,f2=1,f3=0;
        int counter=3;		
		while(counter<=n)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			counter++;
		}
		System.out.println("The required fibonacci number is" + f3 );
		
		

	}

}

import java.util.Scanner;

public class PatternA2Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r =1;
		while(r<=n/2+1)
		{
			int i = n/2+1-r;
			while(i>=1)
			{
				System.out.print(" ");
				i--;
				
			}
			i=1;
			while(i<=2*r-1)
			{
				System.out.print("*");
				i++;
			}
			r++;
			System.out.println();
		}
		r=n/2;
		while(r>=1)
		{
			int i = n/2+1-r;
			while(i>=1)
			{
				System.out.print(" ");
				i--;
				
			}
			i=1;
			while(i<=2*r-1)
			{
				System.out.print("*");
				i++;
			}
			r--;
			System.out.println();
		}
		
	}

}

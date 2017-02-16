import java.util.Scanner;

public class PatternA2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int r = 1;
		
		while(r<=n)
		{
			System.out.print(r);
			
			if(r>2)
			{
				int i =1;
				while(i<=r-2)
				{
				System.out.print("0");
				i++;
			}
			}
			
			if(r>1)
			{
				System.out.print(r);
			}
			
			r++;
			System.out.println();
		}
	}
}

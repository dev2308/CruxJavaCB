import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 2 numbers of which LCM is to be calculated");

		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int lcm = CalLcm(n1, n2);
		System.out.println(lcm);

	}
	
	public static int CalLcm(int n1,int n2)
	{
int minmultiple = (n1>n2)? n1:n2;
		
		while(true)
		{
			if(minmultiple%n1==0 && minmultiple%n2==0)
			{
				break;
			}
			minmultiple++;
		}
		
		return minmultiple;
	}

}

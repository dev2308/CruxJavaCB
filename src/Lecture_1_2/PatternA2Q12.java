import java.util.Scanner;

public class PatternA2Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int r = 1;
		int numStars=n/2+1,numSpaces=1;

		while (r <= n) {
			int i =1;
			while (i<=numStars) {
				System.out.print("*"+"\t");
				i++;
			}
			i = 1;
			while (i<=numSpaces) {
				System.out.print(" "+"\t");
				i++;
			}

			i = 1;
			while (i<=numStars) {
				System.out.print("*"+"\t");
				i++;
			}
			if(r>n/2)
			{
				numSpaces=numSpaces-2;
				numStars++;
			}
			else
			{
				numSpaces=numSpaces+2;
				numStars--;
			}
			r++;
			System.out.println();
		}
		
			

	}

}

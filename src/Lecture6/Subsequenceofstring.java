import java.util.*;


 /*Please dont change class name, Dcoder 
 and class must not be public*/

 //Compiler version JDK 1.8


 class Dcoder
 { 
	public static void main(String args[])
 	{ Scanner s = new Scanner (System.in);
 	  String str = s.nextLine();
 	  subSequence(str);

			
 	}
 	
 	public static void subSequence(String str)
 	{
 		int number = (int)Math.pow(2,str.length());
 		number=number-1;
 		
 		while(number!=0){
 			int rem=0,bin=0,i=0;
 			while(number!=0)
 			{
 				rem=number%2;
 				 bin = bin + (int)(Math.pow(10,i) )*rem;
 				number=number/2;
 				i++;
 			}
 			int j=str.length()-1;
 			String sub = "";
 			while (bin!=0)
 			{
 				if(bin%10==1)
 				{
 					sub = sub+str.charAt(j);
 					
 					
 				}
 				i--;
 				bin=bin/10;
 				System.out.println(sub);
 				number=number-1;
 			}
 		}
 		
 	}
 }
package Lecture5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArrays {

	
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner s=new Scanner(System.in);
	        int n = s.nextInt();
	        int[] arr= new int[n];
	        for(int i = 0 ; i <arr.length;i++)
	            {

	            arr[i]=s.nextInt();
	        }
	        int[] brr= new int[n];
	        for(int i = 0 ; i <brr.length;i++)
	            {

	            brr[i]=s.nextInt();
	        }
	        ArrayList<Integer> result= getIntersection(arr,brr);
	        System.out.println(result);
	    }
	  
	     public static ArrayList<Integer> getIntersection(int[] one, int[] two){
	    
	         Arrays.sort(two);
	         Arrays.sort(one);
	         ArrayList<Integer> resultlist = new ArrayList<Integer>();
	         int p1=0,p2=0;
	         while(p1<one.length&&p2<two.length)
	             {
	             if(one[p1]>two[p2])
	                 {
	                 p2++;
	             }
	             else if (one[p1]<two[p2])
	                 {
	                 p1++;
	             }
	             else
	                 {
	                 resultlist.add(one[p1]);
	                 p1++;
	                 p2++;
	             }
	         }
	         
	         return resultlist;
	    }
	}




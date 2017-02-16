package Lecture5;



import java.util.*;
import java.lang.*;
import java.io.*;


class SubsetsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
		    arr[i]=s.nextInt();
		}
		
		SubsetsOfArray(arr);
	
		
	}
	
	public static void SubsetsOfArray(int[] arr)
	{
	    int noOfDigits= ((int)(Math.pow(2,arr.length)));
	    int k=1;
	    System.out.println("[]");
	    while(noOfDigits!=k)
	    {
	        int i =k;
	        int bin = 0,j=0;
	        while(i!=0)
	        {
	            int rem = i%2;
	            bin = bin + ((int)Math.pow(10,j))*rem;
	            i=i/2;
	            j++;
	            
	        }
	          StringBuilder sb =new StringBuilder("[");
	          int a =0;
	        while(bin!=0)
	        {
	            
	          
	            if(bin%10==1)
	            {
	               sb.append(""+arr[a]+",");
	            }
	           
	            bin=bin/10;
	            a++;
	        }
	       // if(sb.charAt(sb.lastIndexOf(","))==",")
	       // {
	            sb.deleteCharAt(sb.lastIndexOf(","));
	        
	        
	        sb.append("]");
	        System.out.println(sb);
	        k++;
	    }
	}
	
}
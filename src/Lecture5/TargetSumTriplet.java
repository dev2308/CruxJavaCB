package Lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr= new int[size];
		for(int i =0;i<arr.length;i++)
		{
		    arr[i]=s.nextInt();
		   
		}
		
		int target =s.nextInt();
        Arrays.sort(arr);
		targetSumTriplet(arr,target);
	}
	
 	public static void targetSumTriplet(int[] arr,int target)
 	{
 	    for(int i = 0 ;i<arr.length-2;i++)
 	    {
 	        for(int j = i+1 ; j<arr.length-1;j++)
 	        {
 	        	for(int k =j+1;k<arr.length;k++)
 	        	{
 	            if(arr[i]+arr[j]+arr[k]==target)
 	            System.out.println(arr[i]+","+arr[j]+" and "+arr[k]);
 	        	}
 	        }
 	    }
 	}
}

package Lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {


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
		targetSumPair(arr,target);
	}
	
 	public static void targetSumPair(int[] arr,int target)
 	{
 	    for(int i = 0 ;i<arr.length-1;i++)
 	    {
 	        for(int j = i+1 ; j<arr.length;j++)
 	        {
 	            if(arr[i]+arr[j]==target)
 	            System.out.println(arr[i]+" and "+arr[j]);
 	        }
 	    }
 	}

}

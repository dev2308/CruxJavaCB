package Lecture5;

import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int[] arr = takeInput();
		
		System.out.println("******************");
		display(arr);
		System.out.println("******************");
		
		
		
//		int maximum = max(arr);
//		System.out.println("The maximum element is " + maximum);
//		System.out.println("******************");
//		
		
//		System.out.println("Enter the data to be searched");
//		int data = scn.nextInt();
//		int r = linearSearch(arr,data);
//		System.out.println("The element if found at "+ r);
//		
//		System.out.println("The elements of the array before reversing are");
//		display(arr);
//		System.out.println("***********************");
//		reverse(arr);
//		System.out.println("The elements of the array after reversing are");
//		display(arr);
//		System.out.println("***********************");
//		
//		int inv[] = inverse(arr,arr.length);
//		System.out.println("The inverse of the array is");
//		display(inv);
//		System.out.println("***********************");
//		
//		System.out.println("Calling the isInverse function");
//		System.out.println(isInverse(takeInput(), takeInput()));
//		
//		System.out.println("Calling the isMirrorInverse function");
//		System.out.println(isMirrorInverse(takeInput()));
		
		int n = LargestContiSubsetfromArray(arr);
		System.out.println("The Largest contiguous subset from the array is"+ n);
		 bubbleSort(arr);
		 insertionSort(arr);
		
		
	
		
		
	}

	public static int[] takeInput() {
		int[] rv = null;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = scn.nextInt();
		rv = new int[size];

		for (int i = 0; i < rv.length; i++) {
			System.out.println("Enter the" + i + "th element");
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");

		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int maximum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maximum) {
				maximum = arr[i];
			}

		}
		return maximum;
	}

	public static int linearSearch(int[] arr, int data) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data)
				return i;
		}
		return -1;
	}

	public static void reverse(int[] arr) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int t = arr[l];
			arr[l] = arr[r];
			arr[r] = t;
			r--;
			l++;

		}

	}

	public static int[] inverse(int[] arr, int size) {
		int[] inv = new int[size];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
		return inv;
	}

	public static boolean isInverse(int[] one, int two[]) {
		for (int i = 0; i < one.length; i++) {
			if (two[one[i]] != i)
				return false;
		}
		return true;
	}

	public static boolean isMirrorInverse(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr[i]] != i)
				return false;
		}
		return true;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		display(arr);
		

	}
	public static void selectionSort(int[] arr)
	{
		int counter=0;
		while(counter<=arr.length-1)
		{
			
		}
		
	}
	
	public static void insertionSort(int[] arr)
	{
		int counter =1;
		while(counter<=arr.length-1)
		{
			for(int i = counter;i>0;i--)
			{
				if(arr[i-1]>arr[i])
				{
					int temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
				else 
					break;
				
			}
			counter++;
		}
		
		display(arr);
	}
	
	public static int LargestContiSubsetfromArray(int[] arr)
	{
		int max=0;
		int[] sum = new int[arr.length];
		int[] maxi = new int[arr.length];
		
		for(int i =0;i<arr.length;i++)
		{
			max=arr[i];
			sum[0]=max;
			for(int j = i+1;j<arr.length;j++)
			{
				
				sum[j]=arr[j]+max;
				if(sum[j]>max)
				{
					max=sum[j];
				}
			}
			maxi[i]=max;
		}
		int maximum = max(maxi);
		return maximum;
	}
}

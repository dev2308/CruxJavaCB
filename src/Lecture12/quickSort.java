package Lecture12;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=  {6,5,4,3,2,1};
		qckSort(arr,0,arr.length-1);
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void qckSort(int[] arr ,int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		int mid = (lo+hi)/2;
		int pivot=arr[mid];
		int left = lo,right=hi;
		
		while(left<=right)
		{
			while(arr[left]<pivot)
			{
				left++;
			}
			
			while(arr[right]>pivot)
			{
				right--;
			}
			
			if(left<=right)
			{
				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			
			
		}
		qckSort(arr,lo,right);
		qckSort(arr,left,hi);
		
		
	}

}

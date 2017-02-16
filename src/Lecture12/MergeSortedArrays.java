package Lecture12;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] one = {5,18,22,36,43,48};
		int[] arr = {8,7,6,5,4,3,2,1};
		int[] merged = mergeSort(arr,0,arr.length-1);
		
		for(int i = 0;i<merged.length;i++)
		{
			System.out.println(merged[i]+",");
		}

	}
	
	public static int[] mergeSort(int[] arr,int lo,int hi)
	{
		
		if(lo==hi)
		{
			int[] bArray = new int[1];
			bArray[0] = arr[lo];
			return bArray;
			
		}
		int mid =(lo+hi)/2;
		int[] fHalf= mergeSort(arr, lo,mid);

		int[] sHalf= mergeSort(arr,mid+1,hi);
		
		int[] sorted = mergeArray(fHalf,sHalf);
		
		return sorted;
		
		
	}
	public static int[] mergeArray(int[] one ,int[] two)
	{
		int[] merged = new int[one.length+two.length];
		
		int i = 0,j=0,k=0;
		
		while(i<one.length&& j<two.length){
		
			if(one[i]>two[j])
			{
				merged[k]=two[j];
				j++;
				k++;
			}
			else
			{
				merged[k]=one[i];
				i++;
				k++;
			}
			
			
		}
		
		while(i<one.length)
		{
			merged[k]=one[i];
			i++;
			k++;
			
		}
		while(j<two.length)
		{
			merged[k]=two[j];
			j++;
			k++;
		}
		
		return merged;
	}

}

package BinarySearchPracticeProblems;

//Bitonic Array: Array which first is in increasing order and then decreasing order
public class SearchElementInBitonicArray_19 {

	public static void main(String[] args) {
		int [] arr= {1,3,8,12,4,2};
		int key=4;
		int peakIndex=peakEle(arr);
		System.out.println("Peak index is: " + peakIndex);
	int  key1=	binarySearchIncreasing(arr,0,peakIndex-1, 4);
	int key2=	binarySearchDecreasing(arr,peakIndex,arr.length-1, 4);
	
	
	int k=Math.max(key1, key2);
	System.out.println("Element in the bitonic array: " + k);
		

	}
	public static int peakEle(int[] arr)
	{
		int start=0; int end =arr.length-1;
		while (start<=end)
		{
			int mid= start+(end-start)/2;
			if(mid>0 && mid<arr.length-1)
			{
				if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				{
					return mid;
				}
				else if(arr[mid]<arr[mid-1])
				{
					end = mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else if(mid==0)
			{
				if(arr[mid]>arr[mid+1])
					return 0;
				else
					return 1;
			}
			else if(mid==arr.length-1)
			{
				if(arr[mid]>arr[mid-1])
					return mid;
				else
					return mid-1;
			}
				
		}
		return -1;
	}

	public static int binarySearchIncreasing(int[]arr, int start, int end, int key)
	{
	//	int low=start;
		//int high= end;
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
			{
				start=mid+1;
			}
			else
				end=mid-1;
		}
		return -1;
		
	}
	
	public static int binarySearchDecreasing(int[]arr, int start, int end, int key)
	{
		//int low=start;
	//	int high= end;
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return -1;
	}
}

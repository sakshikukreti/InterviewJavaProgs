package BinarySearchPracticeProblems;

import java.util.Arrays;

public class MinDiffEleInSortedArray_15 {

	public static void main(String[] args) {
		int[] arr= {1,3,8,10,15};
		int key=12;
		int floorValue=findFloor(arr,key);
		int ceilValue=findCeil(arr,key);

		if((key-floorValue)>(ceilValue-key))
		{
			System.out.println(ceilValue);
		}
		else
		{
			System.out.println(floorValue);
		}
		// System.out.println(binarySearch(arr,key));
		int[] resultArr= (binarySearch(arr,key));
		System.out.println(Arrays.toString(resultArr));
		
	}
	
	public static int findFloor(int[] arr, int key)
	{
		int start=0; int end=arr.length-1;
		int result1=-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				result1=arr[mid];
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return result1;
	}
	
	public static int findCeil(int[] arr, int key)
	{
		int start=0; int end=arr.length-1;
		int result2=-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==key)
			{
				return arr[mid];
			}
			else if (arr[mid]>key)
			{
				result2=arr[mid];
				end=mid-1;
			}
			else
				start=mid+1;
		}
		return result2;
	}
	
	

	public static int[] binarySearch(int[] arr, int key)
	{
		int[] arr1;
		int start=0; int end=arr.length-1;
		
		 if (key < arr[0])
	            return new int[] {arr[0]};
	        if (key > arr[end])
	            return new int[] {arr[end]};
	
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(key==arr[mid])
			{
				return new int [] {arr[mid]};
			}
			else if(key<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
				
		}
		
		if (Math.abs(arr[start] - key) > Math.abs(arr[end] - key))
		{
			return new int []{ arr[end]};
		}
		else if(Math.abs(arr[start] - key) == Math.abs(arr[end] - key))
		{
			return new int [] {arr[start],arr[end]};
			
		}
		else
			return new int [] {arr[start]};
		
	
	}

}

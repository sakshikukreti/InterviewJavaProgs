package BinarySearchPracticeProblems;

//Program1: First and Last Occurance of element in sorted array
//Program2: Count of an element in sorted Array
import java.util.Arrays;

public class FirstLastOccuranceOfElement_05 {

	public static void main(String[] args) {
		int[] arr= {2,4,10,10,10,18,20};
		//int[] arr1 = new int[] {1,2};
		//int[] arr= {10};
		int n =10;
		int[] result =new int[2];
		result=mainMethod(arr,n);
		System.out.println(Arrays.toString(result));
	
		//Program : Count of an element in sorted Array
		int countOccurance=result[1]-result[0]+1;
		System.out.println("occurance "+ countOccurance );
	}
	
	public static int[] mainMethod(int[]arr, int n)
	{
		return new int[] {firstOccurance(arr, n), lastOccurance(arr,n)};
	}
	public static int firstOccurance(int[] arr, int n)
	{
		int start=0; int end=arr.length-1;
		
		int res=-1;
		if(arr.length==1)
		{
			return 0;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(n==arr[mid])
			{
				res=mid;
				end=mid-1;
			}
			else if(n<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
				
		}return res;
	}
	
	public static int lastOccurance(int[] arr, int n)
	{
		int start=0; int end=arr.length-1;
		
		int res=-1;
		if(arr.length==1)
		{
			return 0;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(n==arr[mid])
			{
				res=mid;
				start=mid+1;
			}
			else if(n<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
				
		}return res;
	}
}

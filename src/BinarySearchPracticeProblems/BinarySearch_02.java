package BinarySearchPracticeProblems;

public class BinarySearch_02 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n =8;
		int keyIndex=binarySearch(arr,n);
		System.out.println(keyIndex);
	}
	public static int binarySearch(int[] arr, int n)
	{
		int start=0; int end=arr.length-1;
		if(arr[0]<arr[1])
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(n==arr[mid])
			{
				return mid;
			}
			else if(n<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
				
		}
		
	}
		return -1;
	}

}

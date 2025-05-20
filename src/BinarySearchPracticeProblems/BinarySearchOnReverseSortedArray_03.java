package BinarySearchPracticeProblems;

public class BinarySearchOnReverseSortedArray_03 {

	public static void main(String[] args) {
		int[] arr= {90,80,65,55,43,35,24,20,8,4};
		int key =4;
		int keyIndex=binarySearch1(arr,key);
		System.out.println(keyIndex);

	}
	
	public static int binarySearch1(int[] arr, int key)
	{
		int start=0; int end=arr.length-1;
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;	
	}

}

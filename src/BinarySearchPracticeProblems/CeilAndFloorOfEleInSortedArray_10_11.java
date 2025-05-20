package BinarySearchPracticeProblems;

public class CeilAndFloorOfEleInSortedArray_10_11 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,8,10,10,12,19};
		int key =5;
		
		int floorValue=printFloor(arr,key);
		System.out.println("Floor Value "+ floorValue);
		
		int ceilValue=printCeil(arr,key);
		System.out.println("Ceil Value "+ ceilValue);

	}
	
	public static int printFloor(int[]arr, int key)
	{
		int start=0; int end= arr.length-1;
		int result=0;
		while (start<=end)
		{
			int mid= start + (end-start)/2;
			if(key ==arr[mid])
				return arr[mid];
			
			else if(arr[mid]< key)
			{
				result=arr[mid];
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return result;
	}
	
	public static int printCeil(int[] arr, int key)
	{
		int start=0; int end= arr.length-1;
		int result=0;
		while (start<=end)
		{
			int mid= start + (end-start)/2;
			if(key ==arr[mid])
				return arr[mid];
			
			else if(arr[mid]>key)
			{
				result = arr[mid];
				end= mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return result;
	}

}

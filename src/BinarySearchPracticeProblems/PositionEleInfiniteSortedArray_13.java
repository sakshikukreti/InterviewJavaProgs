package BinarySearchPracticeProblems;

public class PositionEleInfiniteSortedArray_13 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int res = findPos(arr, 7);
        System.out.println(res);

	}
	public static int findPos(int[] arr, int key)
	{
		int start=0; int end = 1;
		while(arr[end]<key)
		{
			start=end;
			end= end*2;
		}
		int positionFound=binarySearch(arr, start, end, key);
		return positionFound;
	}

	public static int binarySearch(int[]arr, int start, int end, int key)
	{
		while (start<=end)
		{
			int mid= start + (end-start)/2;
			if(arr[mid]==key)
				return mid;
			
			else if(arr[mid]>key)
			{
				end = mid-1;
			}
			else
				start= mid+1;
		}
		return -1;
	}
}

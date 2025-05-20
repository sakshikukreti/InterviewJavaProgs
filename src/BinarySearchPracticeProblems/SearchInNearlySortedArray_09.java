package BinarySearchPracticeProblems;

public class SearchInNearlySortedArray_09 {
	   //nearly sorted array meaning
    /*
        element can be in i, i -1, i+1 position
    */
	
	
	public static void main(String[] args) {
		
		int[] arr= {5,10,30,20,40};
		int key=5;
		
		
		System.out.println(findEle(arr, key));

	}
	public static int findEle(int[] arr, int key)
	{
		int start=0; int end=arr.length-1;
	//	System.out.println(end);
		if(arr.length==1 && arr[0]==key)
		{
			return 0;	
		}
	
		while (start<=end)
		{
			int mid = start+(end-start)/2;
			
			
			if (arr[mid]==key)
				return mid;
			else if(mid-1>=start && arr[mid-1]==key)
			{
				return mid-1;
			}
			else if(mid+1<=end && arr[mid+1]==key)
			{
				return mid+1;
			}
			else if(key<=arr[mid-2])
			{
				return end =mid-2;
			}
			else if(key>=arr[mid+2])
			{
				return start=mid+2;
			}
		}
		return -1;
		
	}

}

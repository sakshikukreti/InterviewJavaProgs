package BinarySearchPracticeProblems;
//Que:  Index of First 1 in a Binary Sorted Infinite Array
public class First1inBinarySortedInfiniteArray_14 {

	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,1};
		int key=1;
		int findFirstIndexOfOne=find1stOne(arr,key);
		System.out.println("Index of First 1 in a Binary Sorted Infinite Array: "+ findFirstIndexOfOne);

	}
	public static int find1stOne(int[]arr, int key)
	{
		int firstOccuranceOfOne=-1;
		int start=0; int end=1;
		while(arr[end]<key)
		{
			start=end;
			end=end*2;	
		}
		return firstOccuranceOfOne=find1stOccuranceofOne(arr, key, start, end);
		
	}
	
	public static int find1stOccuranceofOne(int[]arr, int key, int start, int end)
	{
		int result=-1;
		while (start<=end)
		{
			int mid= start+(end-start)/2;
			
			
			if(arr[mid]==key)
			{
				result=mid;
				end= mid-1;
			}
			else if(key<arr[mid])
			{
				end=mid-1;
				
			}
			else
				start= mid+1;
		}
		return result;
		
	}
}

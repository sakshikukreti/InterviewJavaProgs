package BinarySearchPracticeProblems;

public class FindEleInRotatedSortedArray_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {4,5,6,7,0,1,2};
		//int start=0; int end=arr.length-1;
		int minIndex=findMin(arr);
		int a1=binarySearch(arr,0,minIndex-1,0);
		int a2=binarySearch(arr,minIndex,arr.length-1,0);
		if(a1==-1)
			System.out.println("print a2 "+a2);
		else
			System.out.println("print a1 " +a1);
		}
	
	public static int findMin(int[] arr)
	{
		int n= arr.length;
		int start=0; int end=n-1;
		
		while(start<=end)
		{
			int mid=start+ (end-start)/2;
			int next=(mid+1)%n;
			int prev=(mid-1+n)%n;
			
			
			if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
			{
				return mid;
			}
			 else if(arr[mid]<=arr[end])
	            {
	            end= mid-1;
	            }
	            
	            else if (arr[start]<=arr[mid])
	            {
	            start=mid+1;
	            }
			/* else if(arr[mid]>=arr[0])
			 {
	                start = mid+1;
			 }
	            else 
	            {
	                end = mid-1;
	            }*/
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int start, int end, int key)
	{
		while (start<=end)
		{
			int mid = start+ (end-start)/2;
			
			if(key== arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				end=mid-1;
			}
			else
			{	
				start =mid+1;
			}
		}
		return -1;
	}


}

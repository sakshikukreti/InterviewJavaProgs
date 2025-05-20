package BinarySearchPracticeProblems;

//Peak element which is greater from it's neighbor and array is not sorted
public class PeakElement_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr= {1,2,3,1};
		int[] arr= {2,3,6,7,5};
		System.out.println(positionOfPeakElement(arr));
	}
	
	public static int positionOfPeakElement(int[] arr)
	{
		int start=0; int end= arr.length-1;
		while (start<=end)
		{
			int mid= start + (end-start)/2;
			
			if(mid>0 && mid<end)
			{
				if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				{
					return mid;
				}
				else if(arr[mid]<arr[mid+1])
				{
					start= mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
			else if(mid==0)
			{
				if(arr[0]>arr[1])
				{
					return 0;
				
				}
				else
					return 1;
			}
			else if(mid==arr.length-1)
			{
				if(arr[mid-1]>arr[mid])
				{
					return mid-1;
				}
				else
				{
					return mid;
				}
			}
			
		}
		return -1;
	}

}

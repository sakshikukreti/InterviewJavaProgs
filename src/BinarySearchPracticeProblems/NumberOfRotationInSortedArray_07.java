package BinarySearchPracticeProblems;

public class NumberOfRotationInSortedArray_07 {
//1. Number of rotation == index of min element
//2.Once you find mid and its not min element then you have to move to unsorted array side to find the min element
	//left rotation return mid; right rotation return n-mid
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {11,12,14,15,2,4,6,8};
		//int[]arr={15,2,4,6,8,11,12,14};
		
		//int[]arr= {4, 6, 8, 10, 0, 1, 2 };
	//	int [] arr= {8,9,2,4,5,6};
		
		//int[]arr= {4, 6, 8, 10, 0, 1, 2};
		int[] arr= {4,5,6,7,8,1,2,3};
	
		System.out.println(findMin(arr));
		//System.out.println(numberOfTimsArrayRotated(arr));
		
		//System.out.println(findKRotation(arr,arr.length));
		//System.out.println(findKRotation(arr));

	}
	
	public static int findMin(int[] arr) {
        int n= arr.length;
        int start=0;   int end= n-1;
          
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
             int  prev=(mid+n-1)%n;
             
            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
            {
            	return mid;
            	
            }
            
      /*     else if (arr[start]<=arr[mid])
            {
            start=mid+1;
            }
            else
            {
            end= mid-1;
            }*/
          else if(arr[mid]<=arr[end])
            {
            end= mid-1;
            }
            
            else if (arr[start]<=arr[mid])
            {
            start=mid+1;
            }
           
        }
        return 0;     
    }
	
	
}

package BinarySearchPracticeProblems;

public class BinarySearchNotKNownOrder_04 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	//	int[]arr={1};
		int k = 10;
		
		System.out.print(solveBinarySearch(arr,k));
		

	}
	public static int solveBinarySearch(int[] arr, int k)
	{
		int start=0; int end=arr.length-1;
		
		 boolean isAsscending=false;
		 if(arr[0]<arr[arr.length-1])
		 {
			 isAsscending=true;
		 }
		 while(start<=end)
		 {
			 int mid = start+(end-start)/2;
			 if(arr.length==1 && k==arr[0])
			 {
				 return 0;
			 }
			 else if(k==arr[mid])
			 {
				 return mid;
			 }
			 else if(isAsscending==true && k<arr[mid])
			 {
				 end=mid-1;
			 }
			 else if(isAsscending==true && k>arr[mid])
			 {
				 start= mid+1;
			 }
			 else if(isAsscending==false && k<arr[mid])
			 {
				 start=mid+1;
			 }
			 else if(isAsscending==false && k>arr[mid])
			 {
				 end=mid-1;
			 }
		 }
		 return -1;
			 
	}

}

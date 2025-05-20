package BinarySearchPracticeProblems;

public class nextAlphabetInSortedArray_12 {

	public static void main(String[] args) {
	
		char[]arr= {'a','c','f','h'};
		char key='f';
		char nextAlphabet= findNextAlphabet(arr,key);
		System.out.println(nextAlphabet);

	}
	public static char findNextAlphabet(char [] arr, int key)
	{
		int start=0;
		int end=arr.length-1;
		char result = '#';
		while (start<=end)
		{
			int mid= start+(end-start)/2;
			if(arr[mid]==key)
			{
				start=mid+1;
			}
			else if(arr[mid]<key)
			{
				start= mid+1;
			}
			else if(arr[mid]>key)
			{
				result =arr[mid];
				end=mid-1;
			}
		}
		return result;
	}

}

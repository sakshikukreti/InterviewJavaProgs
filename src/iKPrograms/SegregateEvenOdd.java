package iKPrograms;

import java.util.Arrays;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4};
		System.out.println("Print before array" + Arrays.toString(array));
		 evenOdd(array);
		System.out.println("Print after merge sort" + Arrays.toString(array));

	}
	
	public static void evenOdd(int[] arr)
	{
		int i=0, j=arr.length-1;
		
		while(i<=j)
		{
			if(arr[i]%2==0)
			{
				i++;
			}
			else if((arr[j]%2!=0))
			{
				j--;
			}
			if(arr[i]%2!=0)
			{
				if(arr[j]%2==0)
				{
					arr=swap(arr, i, j);
					i++;
					j--;
				}
				else
					j--;		
			}
			else
				i++;
			}
			}	

	
	
	public static int[] swap(int[]arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
		return arr;
	}
	
}

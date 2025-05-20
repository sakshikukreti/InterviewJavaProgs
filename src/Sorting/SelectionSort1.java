package Sorting;

import java.util.Arrays;

//TimeCOmplexity: O(n^2)
//Space COmplexity: O(1).. Selection sort is not stable and its in-place algo as it does not need extra space

public class SelectionSort1 {

	public static void main(String[] args) {

		//int[] array= {9,8,5,4,2,1};
		int [] array= {9,8,5,6,1};
		//selectSort(array);
		System.out.println(Arrays.toString(selectSort(array)));
		//printArray(array);
	//	System.out.println(Arrays.toString(array));
		

	}
	public static int[] selectSort(int[] array)
	{
		for(int i=0; i<array.length-1; i++)
		{
			
		int minIndex=i;
		for(int j=i+1; j<array.length; j++)
		{
			if(array[j]<array[minIndex])
			{
				minIndex=j;
			}
		}
		int temp=array[minIndex];
		array[minIndex]=array[i];
		array[i]=temp;
	}
		return array;
	}
}

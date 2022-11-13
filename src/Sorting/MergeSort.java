package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5, 8, 3, 9, 4, 1, 7};
		System.out.println("Print before array" + Arrays.toString(array));
		 mergeSort(array);
		System.out.println("Print after merge sort" + Arrays.toString(array));
	}
	public static void mergeSort(int[] array)
	{
		int inputLength=array.length;
		if(inputLength<2)
		{
			return;
		}
		int midIndex= inputLength/2; //mid= low+(high-low)/2;
		
		int[] leftArray=new int[midIndex];
		
		int[] rightArray=new int[inputLength-midIndex];
		for(int i=0; i< midIndex; i++)
		{
			leftArray[i]= array[i];
			
		}
		
		for(int i=midIndex; i< inputLength; i++)
		{
			rightArray[i-midIndex]= array[i];
			
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		helperMerge(array, leftArray, rightArray);
		
		
 	
	}

	public static void helperMerge(int[] array, int[] leftArray, int[] rightArray)
	{
		int leftSize=leftArray.length;
		int rightSize= rightArray.length;
		int i=0 , j=0, k=0;
		
		while(i<leftSize && j<rightSize)
		{
			if(leftArray[i]<=rightArray[j])
			{
				array[k]=leftArray[i];
				i++;
			}
			else
			{
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}

		while(i<leftSize)
		{
			array[k]=leftArray[i];
			i++;
			k++;
		}
			
		while(j<rightSize)
		{
			array[k]=rightArray[j];
			j++;
			k++;
		}
		
		
	}

}

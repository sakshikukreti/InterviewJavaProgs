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
		if(array.length<2)
		{
			return;
		}
		int midIndex=array.length/2;
		
		int[] leftArr=new int[midIndex];
		int[] rightArr= new int[array.length-midIndex];
		
		for(int i=0; i<midIndex; i++)
		{
			leftArr[i]=array[i];
		}
		
		for(int i=midIndex;i<array.length; i++)
		{
			rightArr[i-midIndex]=array[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(array, leftArr, rightArr);
	}
	
	public static void merge(int[] array, int[] leftArr, int[] rightArr)
	{
		int i=0; int j=0; int k=0;
		
		while(i<leftArr.length && j<rightArr.length)
		{
			if(leftArr[i]<rightArr[j])
			{
				array[k]= leftArr[i];
				i++;
			}
			else if(rightArr[j]<leftArr[i])
			{
				array[k]= rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArr.length)
		{
			array[k]= leftArr[i];
			i++;
			k++;
		}
		
		while(j<rightArr.length)
		{
			array[k]= rightArr[j];
			j++;
			k++;
		}
	}

}

package Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSortPractice {

	public static void main(String[] args) {
		
		int [] arr= {9,8,5,6,1};
		
		System.out.println("Quick Sort");
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int lowIndex, int highIndex) {
		
		if(lowIndex>=highIndex)
		{
			return;
		}
		int pivotIndex= new Random().nextInt(highIndex-lowIndex)+lowIndex;
		
		int pivot=arr[pivotIndex]; //Step1. Choose the pivot and swap with the last element of array
		swap(arr,pivotIndex, highIndex);
		
		//Step2. Partitioning step
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		
		while(leftPointer<rightPointer)
		{
			while(arr[leftPointer]<=pivot && leftPointer<rightPointer)
			{
				leftPointer++;
			}
			while(arr[rightPointer]>pivot && leftPointer<rightPointer)
			{
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);	
		}
		swap(arr,leftPointer, highIndex);
		
		//Step3. Recursively sort the left partition and right partition to the pivot
		quickSort(arr,lowIndex,leftPointer-1);
		quickSort(arr,leftPointer+1,highIndex);
		
	}
	
	private static void swap(int[] arr, int index1, int index2)
	{
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}

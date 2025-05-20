package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	
	public static void main(String[] args) {
		int [] arr= {9,8,5,6,1};
		//bubble sort comment added
	/*	System.out.println("Selection Sort");
		selectionSort(arr);
		
		System.out.println("Bubble Sort");
		bubbleSortUsingArray(arr);
		
		System.out.println("Insertion Sort");
		insertionSort(arr);
		
		System.out.println("Merge Sort");
		mergeSort(arr);
		System.out.println("Print after merge sort" + Arrays.toString(arr));
		
		System.out.println("Quick Sort");
		quickSort(arr);*/
		
		bubbleSortWhileLoop(arr);
	/*	ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(5);
		list1.add(3);
		list1.add(1);
		list1.add(6);
		list1=bubbleSortUsingList(list1);
		System.out.println(list1);*/
		
	}
	
	//Selection Sort: We will first store the 1st element index as min index and then traverse array to find out minimum element and swap them
	public static void selectionSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j< arr.length; j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]= temp;	
		}
		System.out.println(Arrays.toString(arr));
	}
	//Bubble sort starts with very first two elements, comparing them to check which one is greater. Find largest element and then
	//remove the large element from the comparison.
	//Worst Case Time Complexity =O(n^2), Best Case=O(n) when array is sorted Space Complexity:
	
	public static void bubbleSortUsingArray(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSortWhileLoop(int[] arr)
	{
		boolean swappedSomething=true;
		while(swappedSomething)
		{
			swappedSomething=false;
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]>arr[i+1])
				{
					swappedSomething=true;
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
			System.out.println("value" + swappedSomething);
		}
		System.out.println(Arrays.toString(arr));
	}

	//Time Complexity: O(N^2), Auxiliary Space: O(1), Stable and in-Place algorithm. 
	//Used when number of elements are small or input array is almost sorted
	
	public static void insertionSort(int[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int temp= arr[i];
			
			int j=i-1;
		
			while (j>=0 && arr[j]>temp)
			{
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void mergeSort(int[] arr)
	{
		if(arr.length<2)
		{
			return;
		}
		int midIndex= arr.length/2;
		int[] leftArr = new int[midIndex];
		int[] rightArr= new int[arr.length-midIndex];
		//Copy half element to left array and another half to right array
		for(int i=0; i<midIndex; i++)
		{
			leftArr[i]= arr[i];
			
		}
		
		for(int i=midIndex; i<arr.length; i++)
		{
			rightArr[i-midIndex]= arr[i];
			
		}
		//Recursive call to divide the array
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(arr, leftArr, rightArr);
		
	}
	private static void merge(int[] arr, int[] leftArr, int[] rightArr)
	{
		int i=0, j=0, k=0;
		while(i<leftArr.length && j<rightArr.length)
		{
			if(leftArr[i]<= rightArr[j])
			{
			arr[k]=leftArr[i];
			i++;
			}
			else
			{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArr.length)
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightArr.length)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}
	
	public static void quickSort(int[] arr)
	{
		
	}
/*	public static ArrayList<Integer> bubbleSortUsingList(ArrayList <Integer> list1)
	{
		
		int n=list1.size();
		for(int i=0; i<n ; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(list1.get(j)> list1.get(j+1))
				{
					//Collections.swap(list1, j, j+1);
					int temp=list1.get(j);
					list1.set(j, list1.get(j+1));
					list1.set(j+1, temp);
				}

			}
		}
		return list1;
		
	}*/
	
	
	

}

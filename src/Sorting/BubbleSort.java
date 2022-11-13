package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
	
	public static void main(String[] args) {
		bubbleSortUsingArray();
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(5);
		list1.add(3);
		list1.add(1);
		list1.add(6);
		list1=bubbleSortUsingList(list1);
		System.out.println(list1);
		
	}
	
	public static void bubbleSortUsingArray()
	{
		int[] array= {5,8,3,9,4,1,7};
		int n= array.length;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static ArrayList<Integer> bubbleSortUsingList(ArrayList <Integer> list1)
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
		
	}
	
	
	

}

package iKPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumInSortedArray {
	static int target=13;
	public static void main(String[] args) {
		
		
		int[] arr= {1, 2, 3, 5, 10};
		
	//	arr=hashing(arr);
	//	System.out.println(Arrays.toString(arr));
		
		arr=hashmapSort(arr, 8);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void twoPointer()
	{
		
	}
	
	public static int[] hashing(int[] arr)
	{
		HashMap <Integer, Integer> map1= new HashMap<Integer, Integer>();
	//	 for(int i: arr)
	 for(int i=0; i<arr.length; i++)
		 {
		 	int num2=target-arr[i];
			 map1.put(arr[i], i);
			 
			/* if(map1.containsKey(num2))
			 {
				 System.out.println("print numbers" +a[i] + " "+ map1.);
			 }*/
			 
			for(int key:map1.keySet())
			 {
				if(key==num2)
				{
					//System.out.println("print numbers" +arr[i] + " "+key);
					//System.out.println("print indexes" + i + " " +map1.get(key));
					return new int[] {arr[i], key}; 
				 }
			
				
			 }
			// return new int[]{-1, -1};
		//System.out.println(map1);
		 }
	 return new int[]{-1, -1};
	
	}
	
	public static int[] hashmapSort(int[] arr, int target)
	{
		HashMap<Integer, Integer> map1= new HashMap <Integer, Integer>();
		
		for(int i=0; i< arr.length; i++)
		{
			int num2= target-arr[i];
			
			if(map1.containsKey(num2))
			{
				return new int[] {map1.get(num2), i};
			}
			else
				map1.put(arr[i], i);
		}
		return new int[] {};
		
	}
	
	public static void TwoSumWithHashSet(int[] arr, int target)
	{
		HashSet <Integer> set1= new HashSet<Integer>();
		
		for(int i: arr)
		{
			int num2= target-i;
			
			if(set1.contains(num2))
			{
				
			}
			
			
			
		}
	}
}
		 
	
	



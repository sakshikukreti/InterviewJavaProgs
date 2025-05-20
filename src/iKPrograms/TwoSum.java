package iKPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
	//	int[] arr= {1, 2, 3, 5, 10};
		int[] arr= {5,3,10,45,1};
		int target=6;
		int[] arr1=twoSumUsingHashMap(arr, target);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Naive approach");
		bruteForce(arr,target);
	//	int[] indexes=bruteForce(arr,target);
	//	System.out.println(Arrays.toString(indexes));
	}
	//O(n) time complexity.
	public static int[] twoSumUsingHashMap(int[] arr, int target) 
	{
		//CReate map with array element and it's index
		HashMap<Integer, Integer> map1= new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			int num2= target-arr[i];
			if(map1.containsKey(num2))
			{
				return new int[] {map1.get(num2), i};
			}
			
			else
			{
				map1.put(arr[i], i);
			}
		}
		return new int[] {-1,-1};
		
	}
	
	//Naive approach ==> int[] arr= {1, 2, 3, 5, 10};
	//int target=7;
	
	//Time complexity: O(n^2)
	
	public static void bruteForce(int[] arr, int target)
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("print the indexes- " + i + ", "+ j);
				//	return new int[] { i, j };
				}
			}
		}
		//return new int[] {};
	}
	

}

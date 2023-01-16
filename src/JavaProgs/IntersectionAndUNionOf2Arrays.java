package JavaProgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IntersectionAndUNionOf2Arrays {

	public static void main(String[] args) {
	int[] arr1= {7, 1, 5, 2, 3, 6};
	int arr2[] = {3, 8, 6, 20, 7} ;
	
	//Intersection(arr1, arr2);
	Union(arr1, arr2);
	}
	public static void Intersection(int[] arr1, int[]arr2)
	{
		HashMap <Integer, Integer> map1= new HashMap<Integer, Integer> ();
		for(int i=0; i< arr1.length; i++)
		{
			map1.put(arr1[i], i);
		}
		
	
		for(int i: arr2)
		{
		/*	if(map1.containsKey(i))
			{
				System.out.println(map1.get(i));
			}*/
			
			if(map1.keySet().contains(i))
			{
				System.out.println(i + " at index "+map1.get(i));
				map1.get(i);
				
			}
		
		}
			
	}
	
	public static void Union(int[] arr1, int[]arr2)
	{
		HashMap <Integer, Integer> map1= new HashMap<Integer, Integer> ();
		for(int i=0; i< arr1.length; i++)
		{
			map1.put(arr1[i], i);
		}
		
		for(int j=0; j< arr2.length; j++)
		{
			map1.put(arr2[j], j);
		}
		
		System.out.println(map1.keySet());
		
		Set<Entry<Integer, Integer>> set1=map1.entrySet();
		for (Entry<Integer, Integer> entry: set1)
		{
			System.out.println(entry.getKey());
		}
		
		
		
	}

}

package JavaProgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInArray {
	
	public static void main(String[] args) {
		int[] array = {1,2,9,9,4,2,4};
		findDuplicateInArray(array);
		
		duplicate1();
		
	}
	

	public static void findDuplicateInArray(int[] array)
	{
		HashMap<Integer, Integer> map1= new HashMap();
		
		for (int ele: array)
		{
			if(map1.get(ele)== null)
			{
				map1.put(ele, 1);
				
			}
			else
			{
				map1.put(ele, map1.get(ele)+1);
			}
		}
		System.out.println("print the hashmap "+ map1);
		
		Set <Entry<Integer, Integer>> entrySet= map1.entrySet();
		
		System.out.println("Print the entry set " + entrySet);
		
		for(Entry<Integer, Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicant element is "+ entry.getKey() + " the value is " + entry.getValue());
			}
		}
		
	}
	
	public static void duplicate1()
	{
		 String[] array = {"a", "b", "c", "d", "e", "a", "c"};

	      //Method 1
	      List<String> list = Arrays.asList(array);          
	      System.out.println("elements in the list are " + list);
	      
	      Set<String> set1= new HashSet<String>();
	      Set<String> resultSet= new HashSet<String>();
	      for(String s: list)
	      {
	    	  if(!set1.add(s))
	    	  {
	    		  resultSet.add(s);
	    	  }
	      }
	      System.out.println("Unique element in the set " + set1);
	      System.out.println("duplicant element in the set " + resultSet);
	      
	}
}

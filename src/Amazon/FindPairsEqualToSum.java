package Amazon;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class FindPairsEqualToSum {
	
	public static void main(String[] args) {
		//int[] array= {0, 14, 0, 4, 7, 8, 3, 5, 7};
		
	//	int sum =11;
		
		int[] array={3,2,4,5};
		
		//findPairsEqualsSum(array, sum);
		
		twoSum(array, 9);
	}
	
	public static void findPairsEqualsSum(int[] array, int sum)
	{
		
		Set set1= new HashSet(array.length);
		 for (int value: array)
		 {
			 int target = sum-value;
			 
			 if(!set1.contains(target))
			 {
				 set1.add(value);
			 }
			 else
			 {
				 System.out.println(value + " " + target);
			 }
		 }
		
	}
	//Brute Force
	public static void twoSum(int[] array, int sum)
	{
		for( int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]+array[j]==sum)
				{
					System.out.println(array[i] +" "+ array[j]);
				}
			}
		}
	}

}

package Recursion;

import java.util.Arrays;
import java.util.List;

public class subsetIK {
	public static void main(String[] args) {
		 List<Integer> list1= Arrays.asList(1,2,3);
	}
/*	public static void subsetHelper(int[] slate, int[] arr)
	{
		if(arr.length==0)
			System.out.println(arr);
		else
		{
			for(int i=0; i<arr.length; i++)
		{
			subsetHelper(slate, )
			
		}
		}
	}*/
	
	public static void printSubset(List<Integer> list1)
	{
		
		subsetHelper1(new int[0], list1);
	}
	
	public static void subsetHelper1(int[] slate, List<Integer> list1)
	{
		if(list1.size()==0)
			System.out.println(slate);
		else
		{
			for(int i=0; i<list1.size(); i++)
		{
			subsetHelper1(slate, list1.subList(i+1, list1.size()));
			subsetHelper1(slate+list1.get(i), list1.subList(i+1, list1.size()));
		}
		}
	}
}

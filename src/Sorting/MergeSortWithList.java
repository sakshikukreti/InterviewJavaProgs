package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortWithList {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList <Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(1);
		arr.add(6);
		//arr=merge_sort(arr);
		//System.out.println(arr);
		 ArrayList< Integer > sortedArray = new ArrayList< Integer >();
		 
		 sortedArray=mergeSortList(arr);
		//System.out.println(sortedArray);
		for (int i = 0; i < sortedArray.size(); i++)
	    {
	        System.out.println(" " + sortedArray.get(i) );
	    }
		
	}
	
	public static  ArrayList<Integer> mergeSortList(ArrayList<Integer> arr)
	{
		 ArrayList < Integer > sorted = new ArrayList< Integer >();
		if(arr.size()<2)
		{
			return new ArrayList();
		}
		int mid = arr.size()/2;
		ArrayList<Integer> leftList1 = new ArrayList <Integer>();
		ArrayList<Integer> rightList1 = new ArrayList <Integer>();
		for(int i=0; i<mid; i++)
		{
			leftList1.add(arr.get(i));
			//leftList1.set(i,arr.get(i));
		}
		
		for(int i=mid; i<arr.size(); i++)
		{
			rightList1.add(arr.get(i));
			//rightList1.set(i-mid,arr.get(i));
		}
		mergeSortList(leftList1);
		mergeSortList(rightList1);
		
		mergeList(leftList1, rightList1);
		
		return sorted;
		
		
	}
	
	private static  ArrayList<Integer>  mergeList( ArrayList<Integer> leftList1, ArrayList<Integer> rightList1)
	{
		ArrayList <Integer> mergedSortedList = new ArrayList<Integer>();
		int i=0, j=0,k=0;
		while(i<leftList1.size() && j<rightList1.size())
		{
	
			if((leftList1.get(i)).compareTo(rightList1.get(j))<0)
			{
				mergedSortedList.add(leftList1.get(i));
				i++;
			}
			else
			{
				mergedSortedList.add(rightList1.get(j));
				j++;
			}
			k++;
		}
		while(i<leftList1.size())
		{
			mergedSortedList.add(leftList1.get(i));
			i++;
			k++;
		}
		while(j<rightList1.size())
		{
			mergedSortedList.add(rightList1.get(j));
			j++;
			k++;
		}
		return mergedSortedList;
	}
	


}

package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {

	insertionSortUsingArray();
	
	ArrayList<Integer>list1= new ArrayList<Integer>();
	list1.add(5);
	list1.add(3);
	list1.add(1);
	list1.add(6);
	
	list1=insertionSortUsingList(list1);
	System.out.println(list1);
}

public static void insertionSortUsingArray()
{
	int[] arr= {5, 8, 3, 9, 4, 1, 7};
	int n= arr.length;
	for(int i =0; i<n; i++)
	{
		int temp=arr[i];
		int j=i-1;
		while (j>=0 && arr[j]>temp )
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
	}
	System.out.println(Arrays.toString(arr));
}

public static ArrayList<Integer> insertionSortUsingList(ArrayList<Integer> list1)
{
	int n=list1.size();
	for(int i=0; i<n; i++)
	{
		int temp= list1.get(i);
		int j= i-1;
		
		while(j>=0 && list1.get(j)>temp)
		{
			list1.set(j+1,list1.get(j));
			j--;			
		}
		
		
		list1.set(j+1, temp);
		
	}
	return list1;
}
}

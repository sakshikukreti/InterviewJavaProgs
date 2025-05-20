package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(1);
		arr.add(6);
		
		System.out.println(arr.size());
		arr=selection_sort(arr);
		System.out.println(arr);
		/*int[] array= {5,8,3,9,4,1,7};
		
		 for(int i=0; i<array.length-1; i++)
		 {
			 int min=array[i];
			 int minIndex=i;
			 
			 for(int j=i+1; j<array.length; j++)
			 {
				 if(array[j]<array[minIndex])
				 {
					 minIndex=j;
					 
				 }
			 }
			 //Swap the found element with the first element
				int temp=array[minIndex];
				 array[minIndex]=array[i];
				 array[i]= temp;
		 }
		 
		/* for (int i=0; i<array.length; ++i)
	            System.out.print(array[i]+" ");
	        System.out.println();*/
		 
		// System.out.println(Arrays.toString(array));
		 
	}
	
	static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
        // Write your code here.
        
        for(int i=0; i< arr.size()-1; i++)
        {
        	int minIndex=i;
        	for(int j=i+1; j<arr.size(); j++)
        		{
        			if(arr.get(j)<arr.get(minIndex))
        			{
        				minIndex=j;
        			}
        		}
        	
        	/*int temp=arr.get(minIndex);
        	arr.set(minIndex, arr.get(i));
        	arr.set(arr.get(i), temp);*/
        			
        
        	Collections.swap(arr, i, minIndex);
        }
     //   System.out.println(arr);
        return arr;
        
          // return new ArrayList();
      /*  System.out.println("Sorted entered are: ");
        for (int x : arr) {
            System.out.print(x + " ");
		}*/
	}
}

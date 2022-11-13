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
		arr=merge_sort(arr);
		System.out.println(arr);
		
	}
	
	public static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
        // Write your code here.
        if(arr.size()<2)
        {
            //return;
        	System.out.println("list is not enough");
        }
        int mid= arr.size()/2;
        int[] leftArr=new int[mid];
        int[] rightArr= new int[arr.size()-mid];
        
        ArrayList<Integer> leftArrList= new ArrayList<Integer>();
        ArrayList<Integer> rightArrList= new ArrayList<Integer>();
        
        
        for(int i=0; i<mid; i++)
        {
         
            leftArrList.set(i, arr.get(i));
        }
        
         for(int i=mid; i<arr.size(); i++)
        {
           // rightArr[i-mid]=arr.get(i);
            rightArrList.set(i-mid, arr.get(i));
        }
         
       //  List<String> al = new ArrayList<String>(Arrays.asList(geeks));
       //  ArrayList<T> arraylist= new ArrayList<T>(Arrays.asList(arrayname));
       
    
      
       
       merge_sort(leftArrList);
       merge_sort(rightArrList);
        
        //merge_sort(Arrays.asList(leftArr));
        // merge_sort(Arrays.asList(rightArr));
        
        helper(arr, leftArrList, rightArrList);
        
        return arr;
    }
    
    static void helper(ArrayList<Integer> arr, ArrayList<Integer> leftArrList, ArrayList<Integer> rightArrList)
    {
        int i=0, j= 0, k=0;
        
        while(i<leftArrList.size() && j< rightArrList.size())
        {
            if(leftArrList.get(i)< rightArrList.get(j))
            {
                arr.add(leftArrList.get(i));
                i++;
            }
            else
            {
                 arr.add(rightArrList.get(j));
                j++;
            }
            k++;
        }
        
        while(i<leftArrList.size())
        {
           arr.add(leftArrList.get(i));
                i++;
                k++;
        }
        
          while(j< rightArrList.size())
        {
            arr.add(rightArrList.get(j));
                j++;
                k++;
        }
    }


}

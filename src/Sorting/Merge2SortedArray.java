package Sorting;

import java.util.Arrays;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int[]arr1= {1,3,5}; //length=n
		int[] arr2= {2,4,6,0,0,0}; //length=2*n
		mergeFunc(arr1, arr2);
		mergeFuncUsingSameArray(arr1,arr2);

	}
	
	public static void mergeFunc(int[] arr1, int[] arr2)
	{
		int n= arr1.length; //3
		int[]res= new int[n+n];
		int i=n-1, j=n-1, k=res.length-1;
		System.out.println("value of K" + k);	
		
		while (j>=0 && i>=0)
		{
			if(arr1[i]>arr2[j])
			{
				res[k]= arr1[i];
				i--;
			}
			else
			{
				res[k]=arr2[j];
				j--;
			}
			k--;
		}
		while(i>=0)
		{
			res[k]=arr1[i];
			i--;
			k--;	
		}
		
		while(j>=0)
		{
			res[k]=arr2[j];
			j--;
			k--;	
		}
		System.out.println(Arrays.toString(res));
		
		
	}
	
	public static void mergeFuncUsingSameArray(int[] arr1, int[] arr2)
	{
		int n= arr1.length; //3
		//int[]res= new int[n+n];
		int i=arr1.length-1, j=arr1.length-1;// k=res.length-1;
		int lastIndex=arr2.length-1;
	//	System.out.println("value of K" + k);	
		
		while (i>=0 && j>=0)
		{
			if(arr1[i]>arr2[j])
			{
				arr2[lastIndex]= arr1[i];
				i--;
			}
			else
			{
				arr2[lastIndex]=arr2[j];
				j--;
			}
			lastIndex--;
		}
		while(i>=0)
		{
			arr2[lastIndex]=arr1[i];
			i--;
			lastIndex--;	
		}
		
		while(j>=0)
		{
			arr2[lastIndex]=arr2[j];
			j--;
			lastIndex--;	
		}
		System.out.println(Arrays.toString(arr2));
		
		
	}

}

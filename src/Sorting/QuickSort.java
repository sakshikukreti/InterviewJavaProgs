package Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {5, 8, 3, 9, 4, 1, 7};
		System.out.println("Print before array" + Arrays.toString(array));
		quickSort(array, 0, array.length-1);
		System.out.println("Print after quick sort" + Arrays.toString(array));
	}
	
	public static void quickSort(int[] array, int lowIndex, int highIndex)
	{
		
		if(lowIndex>=highIndex)
		{
			return;
		}
		
		//to choose pivot randomly, we have to follow this and then replace the random pivot to the high index of the array
		int pivotIndex=new Random().nextInt(highIndex-lowIndex)+lowIndex;
		int pivot = array[pivotIndex];
		swap(array,pivotIndex, highIndex);
		
	//	int pivot=array[highIndex];
		int lp=lowIndex, rp=highIndex;
		while(lp<rp)
		{
			while(array[lp]<=pivot && lp<rp)
			{
				lp++;
			}
			while(array[rp]>=pivot && rp>lp)
			{
				rp--;
			}
			
				//swap the element when the lp and rp meets
			swap(array, lp, rp);
				
		}
			
			swap(array,lp,highIndex );
		
		quickSort(array, lowIndex, lp-1);
		quickSort(array, lp+1, highIndex);
}


public static void swap(int[] array, int index1, int index2)
{
	int temp = array[index1];
	array[index1] = array[index2];
	array[index2]= temp;

}
}

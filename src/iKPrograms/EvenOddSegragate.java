package iKPrograms;

import java.util.Arrays;

public class EvenOddSegragate {

	public static void main(String[] args) {
		//int[] array= {1,2,3,4};
		
		int[] array= {12, 34, 45, 9, 8, 90, 3};
		System.out.println("Print before array" + Arrays.toString(array));
		 evenOdd(array);
		System.out.println("Print after merge sort" + Arrays.toString(array));

	}
	
	public static void evenOdd(int[] array)
	{
		int startIndex=0;
		int lastIndex=array.length-1;
		while (startIndex<lastIndex)
		{
			if(array[startIndex]%2!=0 && array[lastIndex]%2==0)
			{
				int temp=array[startIndex];
				array[startIndex]=array[lastIndex];
				array[lastIndex]=temp;
				
				startIndex++;
				lastIndex--;
				
			}
			else if (array[startIndex]%2==0)
				startIndex++;
			
			else if(array[lastIndex]%2!=0)
				lastIndex--;
		}
	}

}

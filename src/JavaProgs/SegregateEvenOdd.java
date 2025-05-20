package JavaProgs;

import java.util.Arrays;

public class SegregateEvenOdd {
	
	public static void main(String[] args) {
		evenOdd();
		segregateZeroOnes();
	}
	
	//Segregate Even and Odd numbers, Put even first and then odd
	
	public static void evenOdd()
	{
		int[] inputArray= {12, 34, 45, 9, 8, 90, 3};
		
		int n= inputArray.length;
		
		int[] outputArray = new int[n];
		int index=0;
		
		for(int i =0; i< inputArray.length; i++)
		{
			if(inputArray[i]%2==0)
			{
				outputArray[index]=inputArray[i];
				index++;
			}
		}
		
		for(int i =0; i< inputArray.length; i++)
		{
			if(inputArray[i]%2!=0)
			{
				outputArray[index]=inputArray[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(outputArray));
	}
	
	
	//Segregate 0s and 1s in an array, traverse array only once
	
	public static void segregateZeroOnes()
	{
		int[] inputArray =  {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int n= inputArray.length;
		
		int[] outputArray = new int[n];
		int count=0;
		
		//Count the number of 0 in array
		
		for(int i=0; i< inputArray.length; i++)
		{
			if(inputArray[i]==0)
			{
				count++;
			}
		}
		
		for(int j=0; j< count; j++)
		{
			outputArray[j]=0;
		}
		
		for(int i=count; i<n; i++)
		{
			outputArray[i] =1;
		}
		
		System.out.println(Arrays.toString(outputArray));
	}
	
}

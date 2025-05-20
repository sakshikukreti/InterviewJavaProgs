package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeNumInEveryWindow_2 {

	//Sliding window approach
	public static void main(String[] args) {
		int[] arr = {12,-1,-7,8,-15,30,16,28};
		int size=3;
		int i=0, j=0;
		Queue <Integer> q= new LinkedList();
		ArrayList<Integer> list1= new ArrayList();
		
		
		while(j<arr.length)
		{
			if(arr[j]<0)
			{
				q.add(arr[j]);
			}
			
			if((j-i+1)<size)
			{
				j++;
			}
			else if((j-i+1)==size)
			{
				if(q.isEmpty())
				{
					list1.add(0);
				}
				else
				{
					list1.add(q.peek());
					if(arr[i]==q.peek())
					{
						q.poll();
					}
				}
				i++;
				j++;
			}
			
		}
		System.out.println(list1);
		
		bFA(); //Calling Brute Force approach method 
	}
	
	//BruteForce Approach
	public static void bFA()
	{
		int[] arr = {12,-1,-7,8,-15,30,16,28};
		int size=3;
		int i=0, j=0;
		
		for( i=0; i<=arr.length-size; i++)
		{
			boolean found=false;
			//System.out.println("value of i "+ i);
			for (j=i; j<i+3; j++)
			{
				if(arr[j]<0)
				{
				//	System.out.println("value of j "+ j);
					System.out.println(arr[j]);
					found =true;
					break;
				}
			
			}
			if(!found)
			{
				System.out.println("0");
			}
		}
	}
	

}

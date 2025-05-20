package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Print Max of all sub-arrays of size K
public class maxOfAllSubArrays {

	
	public static void main(String[] args) {
		
		int[] arr= {1,3,-1,-3,5,3,6,7};
		int k=3;
		int[] resultArr= new int[arr.length-k+1];
	
		 method(arr,  k, resultArr);
		 System.out.println(Arrays.toString(resultArr));

	}
	
	public static int[] method(int[]arr, int k, int[] resultArr)
	{
		int i=0, j=0;
		Deque <Integer> deque= new LinkedList<> ();
		//ArrayList<Integer> list1= new ArrayList<> ();
		
		while(j< arr.length)
		{
			while(deque.size()>0 && deque.peekLast()<arr[j])
			{
				deque.removeLast();
				//deque.add(arr[j]);
			}
			deque.add(arr[j]);
			
			if(j-i+1<k)
			{
				j++;
			}
			else if((j-i+1)==k)
			{
				resultArr[i]= deque.peek();
				if(arr[i]== deque.peek())
				{
					deque.remove();
				}
				i++;
				j++;
			}
		}
		return resultArr;
	}

}

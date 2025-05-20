package RecursionPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArray_06 {
	public static void main(String[] args) {
		ArrayList list1= new ArrayList(Arrays.asList(3,2,1,4,5,6,7));
		
		System.out.println(sort(list1));
	}
	
	public static ArrayList sort(ArrayList list1)
	{
		//Base Cond
		if(list1.size()==1)
		{
			return list1;
		}
		
		//Hypothesis => Make the input smaller and call the function recursively
		int temp= (int) list1.get(list1.size()-1);
		list1.remove(list1.size()-1);
		
		sort(list1);
		
		//Induction: Insert back the element in the array/list again
		return insert(list1, temp);
	}
	
	public static ArrayList insert(ArrayList list1, int temp)
	{
		//Base Cond
		if(list1.size()==0 || temp >= (int) list1.get(list1.size()-1))
		{
			list1.add(temp);
			return list1;
		}
		
		//Hypothesis => Make the input smaller and call the function recursively
		int value=  (int) list1.get(list1.size()-1);
		list1.remove(list1.size()-1);
		insert(list1, temp);
		
		//Induction: Add back the element in the array/list again
		list1.add(value);
		
		return list1;
	}

}

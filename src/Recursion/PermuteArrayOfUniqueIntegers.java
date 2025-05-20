package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteArrayOfUniqueIntegers {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> slate= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		permuteArrayofUniqueIntegers(slate, list1);

	}

	public static void permuteArrayofUniqueIntegers(ArrayList<Integer> slate, ArrayList<Integer> list1)
	{
		if(list1.size()==0)
		{
			System.out.println(slate);
		}
		
		for(int i=0; i< list1.size(); i++)
		{
			
			 ArrayList<Integer> a=new ArrayList<Integer>();
			 a.addAll(slate);
			 a.add(list1.get(i));
	
			 ArrayList<Integer> b=new ArrayList<Integer>();
			 b.addAll(list1.subList(0, i));
			 b.addAll(list1.subList(i+1, list1.size()));
			
			permuteArrayofUniqueIntegers(a,b);
			
		}
	}

}

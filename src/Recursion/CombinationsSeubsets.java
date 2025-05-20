package Recursion;

import java.util.ArrayList;

public class CombinationsSeubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> slate= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);*/
		
	//	subsetHelper(slate, list1);
		//String str= "123";
		String str="ABC";
		String slate="";
		
		subsetHelper(slate,str);
	
	}
/*	public static void subsetHelper(ArrayList<Integer> slate, ArrayList<Integer> list1)
	{
		if(list1.size()==0)
		{
			System.out.println(slate);
			return;
		}
		
		for(int i=0; i<list1.size(); i++)	
		{
		
			
			ArrayList<Integer> a= new ArrayList<Integer>();
			a.addAll(list1.subList(i+1, list1.size()));
			 
			ArrayList<Integer> slate1=new ArrayList<Integer>();
			slate1.addAll(slate);
			slate1.add(list1.get(i));
		
			//exclude
			subsetHelper(slate,a);
			
			//include
			subsetHelper(slate1, a);
				
		}
	}*/
	public static void subsetHelper(String slate, String str)
	{
		if(str.length()==0)	
		{
			System.out.println("[" + slate + "]");
			return;
		}
		subsetHelper(slate, str.substring(1));
		
		subsetHelper(slate+str.charAt(0), str.substring(1));
		
	}

}

package Recursion;

import java.util.HashSet;
import java.util.Set;

public class PrintingAllUniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> uniqueSubset= new HashSet();
		String str="aab";
		String slate="";
		
		uniqueSubset=printUniqueSubset("",str, uniqueSubset );
		System.out.println(uniqueSubset);
		
	}
	
	public static Set<String> printUniqueSubset(String slate, String str, Set<String> resSet)
	{
		
		if(str.length()==0)
		{
			resSet.add(slate);
			//return new HashSet<>();
			return new HashSet<>();
		}
		
		//exclude
		printUniqueSubset(slate, str.substring(1), resSet);
		
		//include
		printUniqueSubset(slate+str.charAt(0), str.substring(1), resSet);
		
		return resSet;
		

	}

}


package RecursionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;

//Print Subsets | Print PowerSets | Print all Subsequences
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input= "ABC";
		String output=" ";
		System.out.println("Program1: Print all subsets");
		printSubsets(input, output);
		
		System.out.println("Program2 : Print all Unique subsets");
		String input1="AAB";
		String output1=" ";
		HashSet <String> set1= new HashSet <String>();
		printUniqueSubsets(input1, output1, set1);
		
		System.out.println(set1);
		
		ArrayList list1= new ArrayList();
		list1.add(set1);
		Collections.sort(list1);
		System.out.println("Lexographically sorted unique subsets");
		for(Object s: list1)
		{
			System.out.println(s);
		}

	}
	//Print All subsets
	public static void printSubsets(String input, String output)
	{
		if(input.length()==0)
		{
			System.out.println("[" + output + "]");
			return;
		}
		String output1=output;
		String output2=output;
		
		output2=output+input.charAt(0);
		
		input= input.substring(1);
		printSubsets(input, output1);
		printSubsets(input, output2);
		
	}
	
	//Print all unique subsets
	public static HashSet <String> printUniqueSubsets(String input1, String output1, HashSet<String> set1)
	{
	
		if(input1.length()==0)
		{
			//System.out.println("[" + output1 +"]");
			set1.add(output1);
			return set1;
		}
		
		String op1=output1;
		String op2=output1+input1.charAt(0);
		
		input1=input1.substring(1);
		
		printUniqueSubsets(input1, op1, set1);
		printUniqueSubsets(input1, op2, set1);
		 return set1;
	}

}

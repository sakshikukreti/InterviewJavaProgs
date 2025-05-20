package RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "a1B2";
		
		List<String> result=letterCasePermutation(s);
		
		System.out.println(result);
		//for(String ele: list1)
	
	}
	 public static List<String> letterCasePermutation(String s) {

		   String input =s;
	       String output=" ";
	       List<String> list1= new ArrayList<String> ();
	     
	       permhelper(input, output, list1);
	       return list1;

	    }

	    public static List<String> permhelper(String input, String output, List<String> list1)
	    {
	        if(input.length()==0)
	        {
	            list1.add(output);
	            return list1;
	        }
	        if(Character.isAlphabetic(input.charAt(0)))
	        {
	        	String op1= output;
	        	String op2= output;
	        	op1=op1+Character.toLowerCase(input.charAt(0));
	        	op2=op2+Character.toUpperCase(input.charAt(0));
	        	input=input.substring(1);
	        	permhelper(input,op1,list1);
	        	permhelper(input, op2, list1);
	        }
	        else
	        {
	        	String op1= output;
	        	op1= op1+input.charAt(0);
	        	input=input.substring(1);
	        	permhelper(input, op1, list1);
	        }
	        return list1;
	    }

}

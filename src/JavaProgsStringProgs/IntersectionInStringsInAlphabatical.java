package JavaProgsStringProgs;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//Find common characters between strings in alphabetical order
public class IntersectionInStringsInAlphabatical {
	public static void main(String[] args) {
		String str1="thin sticks";
		String str2="thick bricks";
		
		char[] arr1= str1.replaceAll("\\s+", "").toCharArray();
		char[] arr2= str2.replaceAll("\\s+", "").toCharArray();
		
		Set<Character> set1= new TreeSet<Character>();
		Set<Character> set2= new TreeSet<Character>();
		for(int i=0; i< arr1.length; i++)
		{
			set1.add(arr1[i]);
		}
		
		for(int j=0; j< arr2.length; j++)
		{
				set2.add(arr2[j]);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	  public static boolean isPalindrome(String s) {
	        
	       s= s.replaceAll("[^A-Za-z0-9]","");
	        String result="";
	        
	        for(int i=s.length()-1; i>=0; i--)
	        {
	            result= result + s.charAt(i);
	        }
	        if(s.equalsIgnoreCase(result))
	        {
	            return true;
	        }
	        else{
	           return false;
	        }
	    }
	}



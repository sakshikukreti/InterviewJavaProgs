package JavaProgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepeatedAndNonRepeatedChar {
	public static void main(String[] args) {
		
		String str = "JavaConceptOfTheDay";
		
		char[] charArray= str.toCharArray();
		
		HashMap < Character, Integer> map1= new HashMap<Character, Integer>();
		
		for( char c: charArray)
		{
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
			
			}
			else
			{
				map1.put(c, 1);
			}
		}
		
		for(char ch: charArray)
		{
			if(map1.get(ch)>1)
			{
				System.out.println("First repeated char is " + ch);
				break;
			}
		}
		
		for(char ch: charArray)
		{
			if(map1.get(ch)==1)
			{
				System.out.println("First non-repeated char is " + ch);
				break;
			}
		}
		
		//duplicates in array
	
		
		Set <Entry<Character, Integer>> set1 = map1.entrySet();
		

		for(Entry<Character, Integer> entry: set1)
		{
			if(entry.getValue()>1)
			{
				System.out.println("duplicant element is "+ entry.getKey() + " and the value is " + entry.getValue());
			}
		}
		
	}
	
	
	
	

}

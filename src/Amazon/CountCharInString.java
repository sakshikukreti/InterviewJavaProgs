package Amazon;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharInString {
	public static void main(String[] args) {
		
		countCharInStr();

		
	}
	
	public static void countCharInStr()
	{
		String str= "JAVACONCEPTSOFTHEDAY";
		char[] charArray= str.toCharArray();
		
		HashMap <Character, Integer> map1 = new HashMap<Character, Integer> ();
		
		for(char ch: charArray)
		{
			if(map1.containsKey(ch))
			{
				map1.put(ch, map1.get(ch)+1);
				
			}
			else
			{
				map1.put(ch, 1);
			}
		}
		
		System.out.println(map1);
		
			
			

			Set <Entry<Character, Integer>> set1 = map1.entrySet();
			

			for(Entry<Character, Integer> entry: set1)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

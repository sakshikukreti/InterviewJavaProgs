package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class countOccuranceOfAnagram_3 {
	
	public static void main(String[] args) {
		
		String str = "aabaabaa";
		//String str = "aabaabbabbabaa";
        String ptr = "aaba";
        int sum = 0;
        int count = 0;
        int k = ptr.length(); //window Size
        Map<Character, Integer> map1= new HashMap<>();
        
        for(int i=0; i<ptr.length(); i++)
        {
        	char ch= ptr.charAt(i);
        	if(map1.containsKey(ch))
        	{
        		map1.put(ch, map1.get(ch)+1);
        		
        	}
        	else
        	{
        		map1.put(ch, 1);	
        	}
        }
        System.out.println("map1: "+map1);
        count = map1.size();
        int i=0, j=0;
        
        while(j<str.length())
        {
        	char ch= str.charAt(j);
        	if(map1.containsKey(ch))
        	{
        		//int a= map1.get(ch);
        		map1.put(ch, map1.get(ch)-1);
        		
        		if(map1.get(ch)==0)
        		{
        			count--;
        		}
        	}
        	
        	if(j-i+1<k)
        	{
        		j++;
        	}
        	
        	else if((j-i+1)==k)
        	{
        		if(count==0)
        		{
        			sum++;
        		}
        		if(map1.containsKey(str.charAt(i)))
        		{
        			//map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
        			int a= map1.get(str.charAt(i));
        			if(a==0)
        			{
        				count++;
        			}
        			//map1.put(str.charAt(i), ++a);
        			map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
        		}
        		i++;
        		j++;
        	}
        }
        
        System.out.println(sum);
        
        
		
	}

}

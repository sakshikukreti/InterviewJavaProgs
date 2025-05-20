package JavaProgsStringProgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNoOFOcuurancesofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Java J2EE Java JSP J2EE";	
		noOFOccuranceOfChar(str);
		
		String strWithSpaces="OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		removeWhiteSpacesMethod1(strWithSpaces);
		removeWhiteSpacesMethod2(strWithSpaces);
	}
	
	public static void noOFOccuranceOfChar(String str)
	{
		HashMap<Character, Integer> map1= new HashMap<Character, Integer>();
		char[] chArr=str.toCharArray();
		
		for(char ch: chArr)
		{
			if(map1.containsKey(ch))
			{
				map1.put(ch, map1.get(ch)+1);
			}
			else
				map1.put(ch, 1);
		}
		
		System.out.println(map1);  // Will show the no of Ocuurance of each charater in string
		
	Set<Entry<Character,Integer>> entrySet	=map1.entrySet();
		for(Entry<Character, Integer> e:entrySet)
		{
			
			System.out.println( "Key is: "+e.getKey() + " Value is:" + e.getValue());
			
		}
		
		System.out.println("==============================================");
		
		//To find duplicate
		for(Entry<Character, Integer> a:entrySet)
		{
			if(a.getValue()>1)
			{
				System.out.println( "Duplicates are: "+a.getKey() + " " + a.getValue());
			}	
		}
		
		System.out.println("============Found 1st repeated and non-repeated character ===========");
		//To find 1st repeated and non-repeated character
		
		for(char ch:chArr)
		{
			if(map1.get(ch)==1)
			{
				System.out.println("First non-repeated char is " + ch);
				break;
			}
		}
		
		for(char ch:chArr)
		{
			if(map1.get(ch)>1)
			{
		
				System.out.println("First repeated char is " + ch);
				break;
			}
		}

}
	
	public static void removeWhiteSpacesMethod1(String strWithSpaces) {
		
	String strWithouSpace=	strWithSpaces.replaceAll("\\s+", "");
		System.out.println(strWithouSpace);	
	}
	public static void removeWhiteSpacesMethod2(String strWithSpaces) {
		char[] charArr=strWithSpaces.toCharArray();
		
		String Result="";
		
		for(int i=0; i<charArr.length; i++)
		{
			if((charArr[i]!=' ') && (charArr[i]!='\t'))
			{
				Result=Result+charArr[i];
			}
		}
		System.out.println(Result);
	}
}

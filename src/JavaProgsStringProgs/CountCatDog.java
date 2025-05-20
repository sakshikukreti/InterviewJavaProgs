package JavaProgsStringProgs;

import java.util.Arrays;

public class CountCatDog {

	public static void main(String[] args) {
		String str ="1catdog2dog2cat";
		//System.out.println(countCatDog(str));
		
		int perCount=countYZ("fez day");
		System.out.println(perCount);

	}
	
	public static boolean countCatDog(String str)
	{
		int catCount=0;
		int dogCount=0;
		
		for(int i=0; i<str.length()-2; i++)
		{
			
			if(str.substring(i, i+3).equals("cat"))
			{
				catCount++;
			}
			else if(str.substring(i, i+3).equals("dog"))
			{
				dogCount++;
			}
							
		}
		if(catCount==dogCount)
		{
			return true;
		}
		else
			return false;
	}
	
	
	public static int countYZ(String str) {
		  int count=0;
		 String[] words= str.split(" ");
		/*  String str1=str.substring(0,str.split(" "));
		  String str2=str.substring(str.split(" "),str.length());
		  
		  if((str.charAt(str1.length()-1)).equals('y') ||(str.charAt(str1.length()-1)).equals('z'))
		{
		  count++;
		  return count;
		}*/
		 for (int i = 0; i < words.length; i++) {
				String word = words[i];
			for(int j=0; j<word.length(); j++)
			{
				if(word[word.length()-1).equals('y') || (words[words.length-1]).equals('z') )
				{
					count++;
				}
			}
		 }
		 return count;
		
		  
		
		}


}

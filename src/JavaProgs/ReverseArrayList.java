package JavaProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {
public static void main(String[] args) {
	reverseArrayList();
	reverseArray();
	reverseString();
	reverseEachWordOfStringArray();
}
public static void reverseArrayList()
{
	List<String> list1= new ArrayList< String>();
	list1.add("Beans"); 
	list1.add("Soup"); 
	list1.add("Dark Chocolate");
	list1.add("Yogurt"); 
	list1.add("Sausage"); 
	list1.add("Pure Vegetables");
	list1.add("Nuts");

	int size=list1.size();
	for(int i=0; i<list1.size()/2; i++)
	{
		String food = list1.get(i);
		list1.set(i, list1.get(size-i-1));
		list1.set(size-i-1, food);
	}
	System.out.println(list1);
}

public static void reverseArray()
{
	String[] array ={"Java", "is",  "best"};
	
	int size=array.length;
	
	for(int i =0; i<array.length/2; i++)
	{
		String temp=array[i];
		array[i]= array[size-i-1];
		array[size-i-1]=temp;
	}
	System.out.println(Arrays.toString(array));
}

public static void reverseString()
{
	String str= "Java is best";
	char[] array=str.trim().toCharArray();
	System.out.println(Arrays.toString(array));
	System.out.println(array.length);
	
	String resultStr="";
	
	for(int i=array.length-1; i>=0; i--)
	{
		resultStr=resultStr+array[i];
	}
	System.out.println(resultStr);
}

public static void reverseEachWordOfStringArray()
{
String[] array ={"Java", "is",  "best"};
System.out.println(Arrays.toString(array));
	
	int size=array.length;
	for(int i=0; i<array.length; i++)
	{
		String mainStr=" ";
		char[] word=array[i].toCharArray();
		String result="";
		for(int j= word.length-1; j>=0; j--)
		{
			result=result+word[j];
		}
		mainStr=mainStr+result;
		System.out.print(mainStr);
		
		//String[] array1=mainStr.split(" ");
		//System.out.print(Arrays.toString(array1));
	}
}
}

package JavaProgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfString {
	
	
	
	public static void main(String[] args) {
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		Arrays.sort(inputList);
		
		List<String> list1 = Arrays.asList(inputList);
		
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		
		
		Collections.sort(list1, String.CASE_INSENSITIVE_ORDER);
	
		System.out.println(list1);
		
		
	/*for( String s: inputList)
	{
		System.out.println(s);
	}*/
	}

}

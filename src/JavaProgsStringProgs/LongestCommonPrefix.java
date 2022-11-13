package JavaProgsStringProgs;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] arr= {"mint","mini","minerals"};
		
		if(arr.length==1)
		{
			System.out.println("Longest common prefix:" + arr[0]);
		}
		else if(arr.length==0)
		{
			System.out.println("There is no Longest common prefix");
		}
		else
		{
			//sort the array
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
			int length=arr[0].length();
			StringBuilder result= new StringBuilder();
			for(int i=0; i<length; i++)
			{
				if(arr[0].charAt(i)==arr[arr.length-1].charAt(i))
				{
					result.append(arr[0].charAt(i));
				}
				else
				{
					break;
				}
			}
			System.out.println("common prefix is :" +result.toString());
			
		}
	}

}

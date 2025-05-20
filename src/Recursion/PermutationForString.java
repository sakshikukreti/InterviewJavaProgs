package Recursion;

public class PermutationForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="abc";
		 permutationsOfString("",str);
		
		//distinctPermutationsOfString("",str);
		
	//	int n=2;
	//	printAllPermutationsOfDecimalString("",n);

	}
	
	public static void permutationsOfString(String slate, String str)
	{
		if(str.length()==0)
		{
			System.out.println(slate + " ");
		}
		for(int i=0; i< str.length(); i++)
		{
			char ch= str.charAt(i);
			String remainingStr=str.substring(0, i).concat(str.substring(i+1));
			permutationsOfString(slate+ch, remainingStr);
		}
	}
	
	
	public static void distinctPermutationsOfString(String slate, String str)
	{
		if(str.length()==0)
		{
			System.out.println(slate + " ");
		}
		
		 boolean alpha[] = new boolean[26];
		for(int i=0; i< str.length(); i++)
		{
			char ch= str.charAt(i);
			
			
			String remainingStr=str.substring(0, i).concat(str.substring(i+1));
			
			if (alpha[ch - 'a'] == false)
				distinctPermutationsOfString(slate+ch, remainingStr);
			alpha[ch - 'a'] = true;
		}
	}
	
	//Print decimal string of length n

	public static void printAllPermutationsOfDecimalString(String slate, int n)
	{
		if(n>0)
		{
		for(int i=0; i<10; i++)
		{
			printAllPermutationsOfDecimalString(slate+i, n-1);
		}
		}
		else
			System.out.println(slate);
		
	}

}

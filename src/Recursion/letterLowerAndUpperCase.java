package Recursion;

public class letterLowerAndUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="a1b2";
		String slate="";
	
		helper("",input);
	}

	public static void helper(String slate, String input)
	{
		
		if(input.length()==0)
		{
			System.out.println(slate + " ");
		}
	
		else if(Character.isAlphabetic(input.charAt(0)))
		{
			String op1=slate+input.substring(0,1).toLowerCase();
			
			String op2=slate+input.substring(0,1).toUpperCase();
			
			helper(op1, input.substring(1));
			helper(op2, input.substring(1));
		}
		else
		{
			helper(slate+input.charAt(0), input.substring(1));
		}
			
	}
}

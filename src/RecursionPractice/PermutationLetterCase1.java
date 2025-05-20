package RecursionPractice;

public class PermutationLetterCase1 {
	
	public static void main(String[] args) {
		String input= "a1B2";
		
		String output="";
		permHelper(input, output);
	}

	public static void permHelper(String input, String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		
		if(Character.isAlphabetic(input.charAt(0)))
		{
			String op1= output;
			String op2=output;
			
			op1=output+Character.toLowerCase(input.charAt(0));
			op2=output+Character.toUpperCase(input.charAt(0));
			
			input= input.substring(1);
			
			permHelper(input, op1);
			permHelper(input, op2);
		}
		
		else if(Character.isDigit(input.charAt(0)))
		{
			String op1 = output;
			op1=op1+input.charAt(0);
			
			input= input.substring(1);
			permHelper(input, op1);
			
			
		}
	}
}

package RecursionPractice;

public class PermutationWithSpaces {

	public static void main(String[] args) {
		
		String input="ABC";
		String output=" ";
		
		output=output.trim()+input.charAt(0);
		input=input.substring(1);
		
		permutation(input,output);

	}
	public static void permutation(String input, String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		String op1=output+input.charAt(0);
		String op2=output+ " "+input.charAt(0);
		
		input=input.substring(1);
		permutation(input, op1);
		permutation(input, op2);
	}

}

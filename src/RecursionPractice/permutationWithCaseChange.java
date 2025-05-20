package RecursionPractice;

public class permutationWithCaseChange {

	public static void main(String[] args) {
		String input="ab";
		String output=" ";
		
		prmutaionWithCase(input, output);
		

	}
	public static void prmutaionWithCase(String input, String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		
		String output1=output;
		String output2= output;
		
		output1=output+Character.toLowerCase(input.charAt(0));
		output2= output+Character.toUpperCase(input.charAt(0));
		
		input=input.substring(1);
		
		prmutaionWithCase(input, output1);
		prmutaionWithCase(input, output2);
		
	}
}

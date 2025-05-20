package RecursionPractice;

public class NBinaryDigits {

	public static void main(String[] args) {
	 int n=5;
	 int ones=0;
	 int zeros=0;
	 String output="";
	 
	 nBinaryDigit(ones,zeros,n,output);
	}
	public static void nBinaryDigit(int ones, int zeros, int n, String output)
	{
		if(n==0)
		{
			System.out.println(output);
			return;
		}
		
		String op1=output;
		op1=op1+"1";
		nBinaryDigit(ones+1, zeros, n-1, op1);
		
		if(ones>zeros)
		{
			String op2= output;
			op2=op2+"0";
			
			nBinaryDigit(ones, zeros+1, n-1, op2);
		}
	}
}

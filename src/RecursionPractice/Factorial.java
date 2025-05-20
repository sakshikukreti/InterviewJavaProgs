package RecursionPractice;

public class Factorial {

	public static void main(String[] args) {
		
		int result;
		result=fact(4);
		System.out.println("Factorial result: " + result);
	}
	
	public static int  fact(int n)
	{
		if(n==1)
			return 1;
		
		else
		return n*fact(n-1);
	}

}

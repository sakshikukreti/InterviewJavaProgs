package Recursion;

public class NumberOfSubsetInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3};
		int n = arr.length;
		
		int subsetSize=numberOfSubsets(n);
		System.out.println("number of subset will be: " +subsetSize);
		

	}
	public static int numberOfSubsets(int n)
	{
		if(n==0)
			return 1;
		else
			return 2*numberOfSubsets(n-1);
		
	}
	

}

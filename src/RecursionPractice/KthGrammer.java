package RecursionPractice;

public class KthGrammer {

	public static void main(String[] args) {
		int n=2, k=2;
		
		int result=solve(n,k);
		System.out.println(result);

	}
	
	public static int solve(int n,int k)
	{
		//Base Cond
		if(n==1 && k==1)
		{
			return 0;
		}
		
		//Hypothesis
		int mid= (int) ((Math.pow(2, n-1))/2);
		if(k<=mid)
		{
			return solve(n-1,k);
		}
		else
			return 1-solve(n-1,k-mid);
	}

}

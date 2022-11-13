package Recursion;


public class method123 {
	
	public static int nchoosek(int n, int k)
	{
	    if(k==0)
	    	return 1;
	    if(n==0)
	    	return 0;
	    return nchoosek(n-1, k-1)+nchoosek(n-1,k);
	}
	
public static void main(String[] args) {
	int n=4;
	int k=2;
	System.out.println(nchoosek(n,k));
	
}
}

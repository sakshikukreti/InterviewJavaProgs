package iKPrograms;

import java.util.Arrays;

public class MergeOneSortedArrayIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2, 4, 6, 0, 0, 0};
		int [] b= {1,3,5};
		
		int m=3; int n=3;
		
		sortedMerge(a, b,m, n );
		
		//[1, 2, 3, 4, 5, 6]
		
}
	public static void sortedMerge(int[] a, int[]b, int m, int n)
	{
		int lastIndex= m+n-1;
		int i=m-1;
		int j=n-1;
		
		while (j>=0)
		{
			if(i>=0 && a[i]>b[j])
				
			{
				a[lastIndex]=a[i];
				i--;
				//lastIndex--;
			}
			else {
				a[lastIndex]=b[j];
				j--;
			//	lastIndex--;
			}
			lastIndex--;
		}
		
		System.out.println(Arrays.toString(a));
	}
	
}
package SlidingWindow;

public class maxSubArrayOfSizeK_1 {
	
	public int maxSubArray()
	{
		int arr[] = {2,5,1,8,2,9,1};
		int size= 3;
		int i=0;
		int j=0;
		int sum=0;
		int maxSum= Integer.MIN_VALUE;
		while (j<arr.length)
		{
			sum=sum+arr[j];
			if((j-i+1)<size)
			{
				j++;
			}
			else if((j-i+1)==size)
			{
				maxSum=Math.max(maxSum, sum);
				sum=sum-arr[i];
				i++;
				j++;
				
			}
			
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		maxSubArrayOfSizeK_1 obj= new maxSubArrayOfSizeK_1();
		int maximumSum=obj.maxSubArray();
		System.out.println(maximumSum);
		
	}
	
}

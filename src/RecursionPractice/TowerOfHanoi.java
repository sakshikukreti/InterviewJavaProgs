package RecursionPractice;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3; // # of plates
		int s=1;
		int h=2;
		int d=3;
		solveHanoi(s, d, h, n);
		
		//solveHanoi( 'A', 'C', 'B',3 );

	}
	
	public static void solveHanoi(int s, int d, int h, int n)
	{
		if(n==1)
		{
			System.out.println("Moving plate " + n + " from rod "+ s + " to " + d);
			return;
		}
		
		solveHanoi(s, h, d, n-1);
		System.out.println("Moving plate " + n + " from rod "+ s + " to " + d);
		
		solveHanoi(h,d,s,n-1);
	}

}

package RecursionPractice;

import java.util.Stack;

public class DeleteMiddleEleInStack_08 {

	public static void main(String[] args) {
		Stack st = new Stack ();
		st.push(9);
		st.push(3);
		st.push(5);
		st.push(10);
		st.push(1);
	//	st.push(4);

		int k= st.size()/2+1;
		System.out.println(st.size());
		System.out.println("value of k: " +k);
		
	/*	int k= (st.size()+1)/2;
		System.out.println(st.size());
		System.out.println("value of k: " +k);*/
		
		
		 System.out.println("Stack before deleting middle element");
		 for(Object e: st)
		 {
			 System.out.println( e);
		 }
		 
		 solve(st, k);
		 
		 System.out.println("Stack after deleting middle element");
		 
		 for(Object e: st)
		 {
			 System.out.println(e);
		 }
	}
	public static Stack solve(Stack st, int k)
	{
		//Base Cond == FInd the smallest input from st and k ,, k is the smaller input
		if(st.isEmpty())
		{
			return st;
		}
		else if(k==1)
		{
			st.pop();
			return st;
		}
		
		
		//Hypothesis
		int temp= (int) st.pop();
		solve(st, k-1);
		
		//Induction
		st.push(temp);
		
		return st;
		
	}

}

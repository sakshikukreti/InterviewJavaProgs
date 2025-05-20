
package RecursionPractice;

import java.util.Stack;

public class SortStack_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stack <Integer>st = new Stack <Integer>();
		Stack st = new Stack ();
		  st.push(9);
		  st.push(3);
		  st.push(5);
		  st.push(10);
		
		  System.out.println("Stack before sort");
		 for(Object e: st)
		 {
			 System.out.println( e);
		 }
		 
		 SortedStack(st);
		 System.out.println("Stack before sort");
		 
		 for(Object e: st)
		 {
			 System.out.println(e);
		 }
	}
	
	public static Stack SortedStack(Stack st)
	{
		//Base cond
		if(st.isEmpty())
		{
			return st;
		}
		
		//Hypothesis step: Make the input smaller
		int temp= (int) st.pop();
		SortedStack(st);
		
		//Induction step
		return insertEle(st, temp);
			
	}
	
	public static Stack insertEle(Stack st, int temp)
	{
		//Base Condition
		if(st.isEmpty() || (int) st.peek()<=temp)
		{
			st.push(temp);
			return st;
		}
	
		//Hypothesis
		int topValue= (int) st.pop();
		insertEle(st, temp);
		
		//Induction step
		st.push(topValue);
		return st;
		
		
	}

}

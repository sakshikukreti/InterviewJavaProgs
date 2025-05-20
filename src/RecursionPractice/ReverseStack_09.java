package RecursionPractice;

import java.util.Stack;

public class ReverseStack_09 {

	public static void main(String[] args) {
		Stack st = new Stack ();
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println("Print original stack");
		for(Object ele: st)
		{
			System.out.println(ele);
		}
		reverseStack(st);
		
		System.out.println("Print reversed stack");
		for(Object ele: st)
		{
			System.out.println(ele);
		}

	}
	
	public static Stack reverseStack(Stack st)
	{
		if(st.size()==1)
		{
			return st;
		}
		
		int temp = (int) st.pop();
		reverseStack(st);
		
		insert(st,temp);
		return st;
		
	}
	
	public static Stack insert(Stack st, int temp)
	{
		if(st.isEmpty())
		{
			st.push(temp);
			return st;
		}
		
		int value = (int) st.pop();
		insert(st, temp);
		
		st.push(value);
		return st;
	}
	

}

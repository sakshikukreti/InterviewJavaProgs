package RecursionPractice;

import java.util.ArrayList;
import java.util.List;

public class GenerateBalancedParantheses {

	public static void main(String[] args) {
	int n=3;
	int open=n;
	int close=n;
	String output=" ";
	List<String> list1 = new ArrayList<String>();
	
	list1=BalancedParantheses(open, close, output, list1);

	System.out.println(list1);
	
	}
	
	public static List<String> BalancedParantheses(int open, int close, String output, List<String> list1)
	{
		if(open==0 && close==0)
		{
			list1.add(output);
			return list1;
		}
		 // opening parentheses choice is used until it becomes 0
		if(open!=0)
		{
			String op1=output;
			op1=op1+"(";
			BalancedParantheses(open-1,close,op1,list1);
		}
		// when closed is greater than open, we have the closing parentheses choice in the output.
		if(close >open)
		{
			String op2=output;
			op2=op2+")";
			BalancedParantheses(open, close-1, op2, list1);
		}
		return list1;
	}

}

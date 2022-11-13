package Amazon;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
	
		boolean flag=isValid();
		//System.out.println("flag is " + flag);
		
		if(flag==true)
		{
			System.out.println("parantheses are valid");
		}
		else
		{
			System.out.println("Parantheses are not valid");
		}
	}
		
		public static boolean isValid()
		{
			//String str = "{[]}(])";
			
			String str="[";
			
			//String str="[](}[{](){}[]]";
			//String str= "([)]";
			
			
			
			Stack<Character> st= new Stack<Character>();
			char[] array = str.toCharArray();
			
			for(char c:array)
			{
				if(c=='(' || c=='{' || c=='[')
				{
					st.push(c);
				}
				else if(c==')' && !st.isEmpty() && st.peek()=='(')
				{
					st.pop();
				}
				else if(c=='}' && !st.isEmpty() && st.peek()=='{')
				{
					st.pop();
				}
				else if(c==']' && !st.isEmpty() && st.peek()=='[')
				{
					st.pop();
				}
				else
				{
					System.out.println("this else statement");
					return false;
				}
					
			}
			System.out.println("Print stack " + st);
			return st.isEmpty();
			//return false;
		}
}

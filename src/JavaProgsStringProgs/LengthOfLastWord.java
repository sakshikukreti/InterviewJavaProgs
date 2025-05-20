package JavaProgsStringProgs;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		String inputStr="Hello World";
		
		String[] strArr=inputStr.trim().split(" ");
		int length=0;
		
		//int length= strArr.length-1
		
		for(int i= strArr.length-1; i>=0; i--)
		{
			length=strArr[i].length();
			break;
		}
		System.out.println(length);
	}
	
	
	
	

}

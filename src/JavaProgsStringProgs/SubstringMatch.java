package JavaProgsStringProgs;

public class SubstringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Geeks of Java";
		String str2="Java";
		
		
		//Javaa
		//Jav
		subStrignMatch1(str1,str2);
	}
	
	public static void subStrignMatch1(String str1, String str2)
	{
		  boolean found = false;
		int i;
		for(i=0; i< str1.length()-str2.length()+1; i++)
		{
			int j;
			for(j=0; j< str2.length(); j++)
			{
				if(str1.charAt(i+j)!=str2.charAt(j))
					break;
			}
			
			if(j==str2.length())
			{
				found=true;
				break;
			}
		}
		if (found) {
            System.out.println("Found pattern at index: " + i);
        } else {
            System.out.println("Could not find pattern");
        }
		
		
	}

}

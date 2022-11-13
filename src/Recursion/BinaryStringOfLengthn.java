package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.testng.annotations.Test;

public class BinaryStringOfLengthn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(binaryString("", 5));
		binaryString("",5);
	
	}
	@Test
	public static void binaryString(String str, int n)
	{
	
	/*	if(n==0)
		
			System.out.println(str);
		else
			binaryString(str+"0", n-1);
			binaryString(str+"1", n-1);*/
			
			if(n>0)
			{
				binaryString(str+"0", n-1);
				binaryString(str+"1", n-1);
			}
			else
				System.out.println(str);
		
		
	}
	
	
	


	
}

package Recursion;

import java.util.Arrays;

public class PrintCombinationsOfertainLength {
public static void main(String[] args) {
	int n= 4;
	int[] array= new int[n];
	
	for(int i=0; i<n; i++)
	{
		array[i]=i+1;
	}
	int r=2;
	printCombinations("",array,r);
	
}
    

    public static void printCombinations(String soFar, int[] array, int r) {
        if (array.length == 0 ) {
        	 if (soFar.length() == r)
        	 {
        		 System.out.println(soFar);
        	 }
        	
        }
        else {
        	//include
            printCombinations(soFar + array[0], Arrays.copyOfRange(array,1,array.length),r);
            
            //exclude
            printCombinations(soFar, Arrays.copyOfRange(array,1,array.length),r);
        }
    }

}


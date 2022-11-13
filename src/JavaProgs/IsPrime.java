package JavaProgs;

import java.util.Scanner;

public class IsPrime {
	
public static void main(String[] args) {
	

	boolean isPrime=true;
	
	Scanner readkb= new Scanner(System.in);
	int n =readkb.nextInt();
	
	if(n<=1)
	{
		isPrime=false;
	}
	for(int i=2; i<n; i++)
	{
		if(n%i ==0)
		{
			isPrime=false;
			break;
		}
	}
	if(isPrime==true)
	{
		System.out.println(n + " is a prime number");
		
	}
	else
		System.out.println(n + " is a not prime number");

}


}

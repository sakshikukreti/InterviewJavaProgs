package JavaProgs;

public class StarPattern {

	public static void main(String[] args) {
		leftTriangle();
		System.out.println("====================");
		rightTriangle(4);
		System.out.println("====================");
		pyramidTriangle();
		System.out.println("====================");
		pyramidNumberTriangle();
		System.out.println("====================");
		squareStarPattern();
		System.out.println("====================");
		squareNumberPattern();
		System.out.println("====================");
		squareNumberDescendingPattern();
		System.out.println("====================");
		squareNumberVerticalFormat();
		System.out.println("====================");
		squareNumberVerticalDescendingFormat();
	}
	
	public static void leftTriangle()
	{
		for (int i=0; i<5; i++)
		{
			for (int j =0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void rightTriangle(int row)
	{
		for (int i=0; i<row; i++)
		{
			for(int j=0; j<row-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pyramidTriangle()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pyramidNumberTriangle()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	
	public static void squareStarPattern()
	{
		for (int i=0; i< 5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void squareNumberPattern()
	{
		for (int i=0; i< 5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void squareNumberDescendingPattern()
	{
		for(int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				System.out.print(4-j + " ");
			}
			System.out.println();
		}	
	
	}
	
	
	public static void squareNumberVerticalFormat()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void squareNumberVerticalDescendingFormat()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(4-i + " ");
			}
			System.out.println();
		}
	}
}

public class Conversion 
{	
	public static char[] DecToBinary(int number)
	{
		char output[] = new char [32];
		
		//Student code goes here
		
		return output;
	}
	
	public static int BinaryToDec(char number[])
	{
		int output = 0;
		
		//Student code goes here
		
		return output;
	}
	
	public static void println(String prefix, char array[])
	{
		System.out.print(prefix);
		for(char c : array)
		{
			System.out.print(c);
	 	}
		System.out.println();
	}
	
	public static void print(String prefix, char array[])
	{
		System.out.print(prefix);
		for(char c : array)
		{
			System.out.print(c);
	 	}
	}
	
	public static void TestDecToBinary()
	{
		int valuesToTest[] = {0, 1, -1, 100, -100, 2147483647, -2147483648};
		
		System.out.println("    Decimal     Binary");
		for(int index = 0; index < valuesToTest.length; ++index)
		{
			System.out.format("%11d     ",valuesToTest[index]);
			println("", DecToBinary(valuesToTest[index]));
		}
	}
	
	public static void TestBinToDecimal()
	{
		char valuesToTest[][] = {
								 {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
								 {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1'},
								 {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
								 {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','0','0','1','0','0'},
								 {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0','1','1','1','0','0'},
								 {'0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'},
								 {'1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'}
								};
		
		System.out.println("Binary                                Decimal");
		for(int index = 0; index < valuesToTest.length; ++index)
		{
			print("",valuesToTest[index]);
			System.out.format("  %11d\n",BinaryToDec(valuesToTest[index]));
		}
	}
	
	public static void main(String[] args)
	{
		TestDecToBinary();
		System.out.format("\n\n");
		TestBinToDecimal();
	}
}

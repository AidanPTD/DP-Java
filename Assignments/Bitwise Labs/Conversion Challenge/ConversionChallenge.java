public class ConversionChallenge 
{	
	public static char[] DecToHex(int number)
	{
		char[] output = new char[8];
		
		//Student code goes here
		
		return output;
	}
	
	public static int HexToDec(char number[])
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
	
	public static void TestDecToHex()
	{
		int valuesToTest[] = {0, 1, -1, 100, -100, 2147483647, -2147483648};
		
		System.out.println("    Decimal   Hexadecimal");
		for(int index = 0; index < valuesToTest.length; ++index)
		{
			System.out.format("%11d   ",valuesToTest[index]);
			println("", DecToHex(valuesToTest[index]));
		}
	}
	
	public static void TestHexToDec()
	{
		char valuesToTest[][] = {
								 {'0','0','0','0','0','0','0','0'},
								 {'0','0','0','0','0','0','0','1'},
								 {'f','f','f','f','f','f','f','f'},
								 {'0','0','0','0','0','0','6','4'},
								 {'f','f','f','f','f','f','9','c'},
								 {'7','f','f','f','f','f','f','f'},
								 {'8','0','0','0','0','0','0','0'},
								};
		
		System.out.println("Hexadecimal       Decimal");
		for(int index = 0; index < valuesToTest.length; ++index)
		{
			print("",valuesToTest[index]);
			System.out.format(" %16d%n", HexToDec(valuesToTest[index]));
		}
	}
	
	public static void main(String[] args)
	{
		TestDecToHex();
		System.out.format("\n\n");
		TestHexToDec();
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main
{
	public static char[] DecToBinary(int number)
	{
		// The output array that the binary version of "number" is stored in
		char output[] = new char[32];
		// The mask used to check if the bytes are all set
		int mask = 1;
		// The binary array used to store the binary number
		char[] binaryString = new char[output.length];
		char[] binary = Integer.toBinaryString(number).toCharArray();
		// Storing the binary value in the binary string array
		for (int i = binary.length - 1; i > 0; i--)
		{
			binaryString[i] = binary[i];
		}
		// Looping through the BS array, starting from the end of the array
		for (int i = 31; i > 0; i--)
		{
			// Checking if the bytes are all set using the AND operator
			output[i] = binaryString[i];
			if ((number & mask) == 0)
			{
				output[i] = '0';
			} else if ((number & mask) != 0)
			{
				output[i] = '1';
			}
			mask >>>= 1;
		}
		// Storing the binary string in the output array
		for (int i = 32; i > output.length; i--)
		{
			output[i] = binaryString[i];
		}
		mask <<= 1;
		// Return the output array
		return output;
	}
	
	// To be developed...eventually.
	public static int BinaryToDec(char number[])
	{
		int output = 0;
		return output;
	}
	
	public static void println(String prefix, char array[])
	{
		System.out.print(prefix);
		for (char c : array)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void print(String prefix, char array[])
	{
		System.out.print(prefix);
		for (char c : array)
		{
			System.out.print(c);
		}
	}
	
	public static void TestDecToBinary()
	{
		int valuesToTest[] = { 0, 1, -1, 100, -100, 2147483647, -2147483648 };
		
		System.out.println("    Decimal     Binary");
		for (int index = 0; index < valuesToTest.length; ++index)
		{
			System.out.format("%11d     ", valuesToTest[index]);
			println("", DecToBinary(valuesToTest[index]));
		}
	}
	
	public static void TestBinToDecimal()
	{
		char valuesToTest[][] = { { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' }, { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1' }, { '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1' }, { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '1', '0', '0' }, { '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '1', '1', '1', '0', '0' },
				{ '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1' }, { '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' } };
		
		System.out.println("Binary                                Decimal");
		for (int index = 0; index < valuesToTest.length; ++index)
		{
			print("", valuesToTest[index]);
			System.out.format("  %11d\n", BinaryToDec(valuesToTest[index]));
		}
	}
	
	public static void main(String[] args)
	{
		/*File file = new File("myOutput.txt");
		FileOutputStream fos;
		try
		{
			fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}*/
		TestDecToBinary();
		System.out.format("\n\n");
		TestBinToDecimal();
	}
}

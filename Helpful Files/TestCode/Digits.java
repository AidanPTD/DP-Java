import java.util.ArrayList;

public class Digits
{
	private ArrayList<Integer> digitList;
	
	public Digits(int num)
	{
		if(num >= 0)
		{
			int length = Integer.toString(num).length();
			digitList.add((int) (num / (Math.pow(10,  length)))); // first digit
			digitList.add((int) (num % (Math.pow(10,  length - 1))));
			for (int i = 0; i < length - 1; i++)
			{
			
			}
			digitList.add((int) (num % (Math.pow(10,  length - 2))));
			digitList.add(num % 10); // last digit
		}
	}
}

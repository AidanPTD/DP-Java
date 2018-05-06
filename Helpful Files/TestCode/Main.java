import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
    /*int x = 0;
    int y = 962;
    int worldBoundary = 5000;
    int frame = 7;
    for (x = 0; x < worldBoundary; x += 42) {
      if (x < worldBoundary - 1) {
        System.out.printf("{\"frame\": %d, \"x\": %d, \"y\": %d},", frame, x, y);
      }
      else{
        System.out.printf("{\"frame\": %d, \"x\": %d, \"y\": %d}", frame, x, y);
      }
    }
    Scanner input = new Scanner(System.in);
   */
		/*List<String> aList1 = new ArrayList(Arrays.asList("1", "2", "3"));
		List<Integer> integerList = new ArrayList<Integer>(3);
		System.out.println(toArray(integerList));
		//printList(aList1);*/
		Digits d1 = new Digits(1234);
		System.out.println();
		
	}
	public static int[] toArray(List<Integer> list)
	{
		int[] array = new int[list.size()];
		Object[] listArray = list.toArray();
		return array;
	}
	public static void printList(List<String> list)
	{
		System.out.print("[");
		for (int i = 0; i < list.size() - 1; i++)
		{
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.print(list.get(list.size() - 1) + "]");
		
	}
	public  static  void printNumbersDigits(int number) {
		List<Integer> list = new ArrayList<Integer>();
		
	}
	public static boolean isOdd(int value)
	{
		return (value & 1) == 0;
	}
	
	public static boolean haveOppositeSigns(int n1, int n2)
	{
		String binaryN1 = Integer.toBinaryString(n1);
		String binaryN2 = Integer.toBinaryString(n2);
		//System.out.println(n1 + " = " + binaryN1);
		//System.out.println(n2 + " = " + binaryN2);
		return binaryN1.charAt(0) != binaryN2.charAt(0);
	}
	
	public static void replace(ArrayList<Integer> list, int value, int replacement)
	{
		int size = list.size();
		int count = 0;
		System.out.println("Before:");
		for (Integer num : list)
		{
			System.out.print(num + " ");
		}
		for (int i = 0; i < size; i++)
		{
			int num = list.get(i);
			if (num == value)
			{
				list.set(i, replacement);
				count += 1;
			}
		}
		if (count == 0)
		{
			System.out.println("%nThat number doesn't appear in the array.");
		} else
		{
			System.out.println("%nAfter:");
			for (Integer num : list)
			{
				System.out.print(num + " ");
			}
		}
	}
}
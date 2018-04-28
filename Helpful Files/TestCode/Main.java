import java.util.*;

public class Main {
  public static void main(String[] args) {
    /*int x = 0;
    int y = 962;
    int numOfTiles = 5000;
    int frame = 7;
    for (x = 0; x < numOfTiles; x += 42) {
      if (x < numOfTiles - 1) {
        System.out.printf("{\"frame\": %d, \"x\": %d, \"y\": %d},", frame, x, y);
      }
      else{
        System.out.printf("{\"frame\": %d, \"x\": %d, \"y\": %d}", frame, x, y);
      }
    }
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int num2 = input.nextInt();
    System.out.println(haveOppositeSigns(num, num2));*/
    ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 4, 5));
    int size = aList.size();
    /* for (int i = 0; i < size; ++i) {
      System.out.print(aList.get(i) + " ");
    }
    for (Integer num : aList) {
      System.out.print(num + " ");
    } */
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    int replacement = input.nextInt();
    replace(aList, value, replacement);
  }

  public static boolean isOdd(int value) {
    return (value & 1) == 0;
  }

  public static boolean haveOppositeSigns(int n1, int n2) {
    String binaryN1 = Integer.toBinaryString(n1);
    String binaryN2 = Integer.toBinaryString(n2);
    //System.out.println(n1 + " = " + binaryN1);
    //System.out.println(n2 + " = " + binaryN2);
    return binaryN1.charAt(0) != binaryN2.charAt(0);
  }

  public static void replace(ArrayList<Integer> list, int value, int replacement) {
    int size = list.size();
    for (int i = 0; i < size; i++) {
      int num = list.get(i);
        if(num == value)
        {
          num = replacement;
        }
    }
  }
}
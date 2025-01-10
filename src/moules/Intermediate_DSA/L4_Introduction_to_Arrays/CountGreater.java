package moules.Intermediate_DSA.L4_Introduction_to_Arrays;

public class CountGreater {

  static int countGreaterThenItSelf(int[] A) {
    int count = 0;
    int maxValue = Integer.MIN_VALUE;

    for (int ele: A) {
      maxValue = Math.max(maxValue, ele);
    }

    for (int ele: A) {
      if (ele != maxValue) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countGreaterThenItSelf(new int[]{-3, -2, 6, 8, 4, 8, 5}));
    System.out.println("---------------");
    System.out.println(countGreaterThenItSelf(new int[]{5, 5, 3}));
  }
}

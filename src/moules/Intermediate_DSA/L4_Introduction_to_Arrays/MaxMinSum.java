package moules.Intermediate_DSA.L4_Introduction_to_Arrays;

public class MaxMinSum {

  static int maxMinSum(int[] A) {
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    int sum = 0;

    for (int ele: A) {
      maxValue = Math.max(maxValue, ele);
      minValue = Math.min(minValue, ele);
    }

    return minValue + maxValue;
  }

  public static void main(String[] args) {
    int[] arr1 = { -2, 1, -4, 5, 3 };
    int[] arr2 = { 1, 3, 4, 1 };

    System.out.println();
    System.out.println(maxMinSum(arr1));
    System.out.println("--------");
    System.out.println(maxMinSum(arr2));
    System.out.println();
  }
}

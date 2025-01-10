package moules.Intermediate_DSA.L4_Introduction_to_Arrays;

import java.util.Arrays;

public class ReverseInRange {

  static int[] reverseInRange(int[] A, int B, int C) {
    int index = B;
    int jIndex = C;

    while (index < jIndex) {
      int temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;
      index++;
      jIndex--;
    }

    return A;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { -3, 4, 2, 8, 7, 9, 6, 2, 10 };

    System.out.println();
    System.out.println(Arrays.toString(arr));
    System.out.println("-----------------------");
    System.out.println(Arrays.toString(reverseInRange(arr, 3, 7)));
    System.out.println();
  }
}

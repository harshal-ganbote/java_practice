package moules.Intermediate_DSA.L4_Introduction_to_Arrays;

import java.util.Arrays;

public class ArrayRotation {

  static void reverseArray(int[] A, int B, int C) {
    int index = B;
    int jIndex = C;

    while (index < jIndex) {
      int temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;
      index++;
      jIndex--;
    }
  }

  static int[] rotateArray(int[] A, int B) {
    int N = A.length;
    B = B % N;

    reverseArray(A, 0, N-1);
    reverseArray(A, 0, B-1);
    reverseArray(A, B, N-1);

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 3, -2, 1, 4, 6, 9, 8 };
    int[] arr2 = new int[] { 4, 1, 6, 9, 2, 14, 7, 8, 3 };

    System.out.println();
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(rotateArray(arr1, 3)));
    System.out.println("------------------------------------");
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(rotateArray(arr2, 4)));
    System.out.println();
  }
}

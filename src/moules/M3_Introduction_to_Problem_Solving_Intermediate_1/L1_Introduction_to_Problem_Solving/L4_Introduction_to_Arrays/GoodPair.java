package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L4_Introduction_to_Arrays;

public class GoodPair {

  static int goodPair(int[] A, int B) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index + 1;jIndex < N; jIndex++) {
        if (A[index] + A[jIndex] == B) {
          return 1;
        }
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 3, -2, 1, 4, 3, 6, 8 };
    int[] arr2 = new int[] { 2, 4, -3, 7 };
    int[] arr3 = new int[] { 3, 5, 2, 7, 3 };

    System.out.println();
    System.out.println(goodPair(arr1, 10));
    System.out.println("------");
    System.out.println(goodPair(arr2, 5));
    System.out.println("------");
    System.out.println(goodPair(arr3, 6));
    System.out.println();
  }
}

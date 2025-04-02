package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L5_Arrays_Prefix_Sum;

import java.util.Arrays;

public class EvenNumbersRange {

  static  int[] constructPrefixSum (int[] A) {
    int N = A.length;
    int[] prefixSum = new int[N];

    prefixSum[0] = (A[0] & 1) == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      prefixSum[index] = prefixSum[index-1] + ((A[index] & 1) == 0 ? 1 : 0);
    }

    return prefixSum;
  }

  static int[] countEvenNumbersInRange(int[] A, int[][] Q) {
    int N = A.length;
    int M = Q.length;
    int[] ans = new int[M];
    int[] prefixSum = constructPrefixSum(A);

    for (int index = 0; index < M; index++) {
      int leftIndex = Q[index][0];
      int rightIndex = Q[index][1];

      if (leftIndex > 0) {
        ans[index] = prefixSum[rightIndex] - prefixSum[leftIndex - 1];
      } else {
        ans[index] = prefixSum[rightIndex];
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[][] arr1B = { { 0, 2 }, { 2, 4 }, { 1, 4 } };
    int[] arr2 = { 2, 1, 8, 3, 9, 6 };
    int[][] arr2B = { { 0, 3 }, { 3, 5 }, { 1, 3 }, { 2, 4 } };

    System.out.println();
    System.out.println(Arrays.toString(countEvenNumbersInRange(arr1, arr1B)));
    System.out.println("----------------------------");
    System.out.println(Arrays.toString(countEvenNumbersInRange(arr2, arr2B)));
    System.out.println();
  }
}

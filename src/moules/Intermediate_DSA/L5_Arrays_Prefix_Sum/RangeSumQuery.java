package moules.Intermediate_DSA.L5_Arrays_Prefix_Sum;

import java.util.Arrays;

public class RangeSumQuery {

  static int[] rangeSumQueryOptimizedApproach(int[] A,int[][] Q) {
    int N = A.length;
    int M = Q.length;
    int[] ans = new int[M];
    int[] prefixSum = PrefixSum.prefixSum(A);

    for (int index = 0; index < M; index++) {
      int leftIndex = Q[index][0];
      int rightIndex = Q[index][1];

      if (leftIndex == 0) {
        ans[index] = prefixSum[rightIndex];
      } else {
        ans[index] = prefixSum[rightIndex] - prefixSum[leftIndex - 1];
      }
    }

    return ans;
  }

  static int[] rangeSumQueryBruteForceApproach(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];

    for (int index = 0; index < M; index++) {
      int leftIndex = B[index][0];
      int rightIndex = B[index][1];
      int sum = 0;

      for (int jIndex = leftIndex; jIndex <= rightIndex; jIndex++) {
        sum += A[jIndex];
      }

      ans[index] = sum;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
    int[][] Q = { { 1, 3 }, { 0, 4 }, { 2, 7 } };

    System.out.println();
    System.out.println(Arrays.toString(rangeSumQueryOptimizedApproach(arr, Q)));
    System.out.println("-----------------");
    System.out.println(Arrays.toString(rangeSumQueryBruteForceApproach(arr, Q)));
  }
}

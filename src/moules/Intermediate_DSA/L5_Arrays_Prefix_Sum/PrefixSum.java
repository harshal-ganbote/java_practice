package moules.Intermediate_DSA.L5_Arrays_Prefix_Sum;

public class PrefixSum {

  static int[] prefixSum(int[] A) {
    int N = A.length;
    int[] prefixSum = new int[N];

    prefixSum[0] = A[0];
    for (int index = 1; index < N; index++) {
      prefixSum[index] = prefixSum[index-1] + A[index];
    }

    return prefixSum;
  }
}

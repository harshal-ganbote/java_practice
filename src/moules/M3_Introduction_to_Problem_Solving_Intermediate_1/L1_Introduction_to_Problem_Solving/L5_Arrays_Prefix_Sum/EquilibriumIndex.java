package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L5_Arrays_Prefix_Sum;

public class EquilibriumIndex {

  static int findEquilibriumIndex(int[] A) {
    int N = A.length;
    int[] prefixSum = new int[N];
    prefixSum[0] = A[0];

    for (int index = 1; index < N; index++) {
      prefixSum[index] = prefixSum[index-1] + A[index];
    }

    for (int index = 0; index < N; index++) {
      int leftSum = 0;
      int rightSum;

      if (index > 0) {
        leftSum = prefixSum[index-1];
      }
      rightSum = prefixSum[N-1] - prefixSum[index];

      if (leftSum == rightSum) {
        return index;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -7, 1, 5, 2, -4, 3, 0 };
    int[] arr2 = new int[] { 1, 2, 3 };

    System.out.println();
    System.out.println(findEquilibriumIndex(arr1));
    System.out.println("------");
    System.out.println(findEquilibriumIndex(arr2));
    System.out.println();
  }
}

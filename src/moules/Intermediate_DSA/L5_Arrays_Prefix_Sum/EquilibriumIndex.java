package moules.Intermediate_DSA.L5_Arrays_Prefix_Sum;

public class EquilibriumIndex {

  static int findEquilibriumIndex(int[] A) {
    int N = A.length;
    int[] prefixSum = PrefixSum.prefixSum(A);


    for (int index = 0; index < N; index++) {
      int leftSum = index == 0 ? 0 : prefixSum[index -1];
      int rightSum = prefixSum[N-1] - prefixSum[index];

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

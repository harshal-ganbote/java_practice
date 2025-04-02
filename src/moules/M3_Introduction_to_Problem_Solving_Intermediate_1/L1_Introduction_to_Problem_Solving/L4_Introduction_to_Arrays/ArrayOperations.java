package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L4_Introduction_to_Arrays;

public class ArrayOperations {

  static void traverse(int[] A) {
    for (int ele: A) {
      System.out.print(ele + " ");
    }
    System.out.println();
  }

  static int[] insertAt(int[] A, int pos, int val) {
    int N = A.length;
    int[] ans = new int[N + 1];
    int j = N-2;

    while (j >= pos) {
      ans[j+1] = A[j];
      j--;
    }
    ans[pos] = val;

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    traverse(arr);
    traverse(insertAt(arr, 2, 3));
  }
}

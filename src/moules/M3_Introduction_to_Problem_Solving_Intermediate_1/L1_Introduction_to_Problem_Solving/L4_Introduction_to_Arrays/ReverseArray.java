package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L4_Introduction_to_Arrays;

import java.util.Arrays;

public class ReverseArray {


  static int[] reverseArray(int[] A) {
    int N = A.length;
   int[] ans = new int[N];

   for (int index = 0; index < N; index++) {
     ans[index] = A[N - 1 - index];
   }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -1, 4, 7, 6, -2, 7, 8, 10 };
    int[] arr2 = new int[] { -1, 6, 3, 2, 8, 9, 10 };

    System.out.println();
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(reverseArray(arr1)));
    System.out.println("----------------------------------");
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(reverseArray(arr2)));
    System.out.println();
  }
}

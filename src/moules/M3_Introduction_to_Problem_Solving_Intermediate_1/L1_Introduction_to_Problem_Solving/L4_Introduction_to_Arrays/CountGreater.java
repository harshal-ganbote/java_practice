package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving.L4_Introduction_to_Arrays;

public class CountGreater {

  static int countGreaterThenItSelf(int[] A) {
    int maxValue = Integer.MIN_VALUE;
    int ans = 0;

    for (int ele: A) {
      maxValue = Math.max(maxValue, ele);
    }

    for (int ele: A) {
      if (ele < maxValue) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(countGreaterThenItSelf(new int[]{-3, -2, 6, 8, 4, 8, 5}));
    System.out.println("---------------");
    System.out.println(countGreaterThenItSelf(new int[]{5, 5, 3}));
  }
}

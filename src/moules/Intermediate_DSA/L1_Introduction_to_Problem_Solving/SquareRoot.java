package moules.Intermediate_DSA.L1_Introduction_to_Problem_Solving;

public class SquareRoot {

  static int perfectSquareRoot(int A) {

    for (int num = 1; num * num <= A; num++) {
      if (num * num == A) {
        return num;
      }
    }

    return -1;
  }

  static int squareRootFloor(int A) {
    int ans = -1;

    for (int num = 0; num * num <= A; num++) {
      if (num * num <= A) {
        ans = num;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(squareRootFloor(16));
    System.out.println("---------------");
    System.out.println(squareRootFloor(15));
    System.out.println("---------------");
    System.out.println(perfectSquareRoot(81));
    System.out.println("---------------");
    System.out.println(perfectSquareRoot(55));
  }
}

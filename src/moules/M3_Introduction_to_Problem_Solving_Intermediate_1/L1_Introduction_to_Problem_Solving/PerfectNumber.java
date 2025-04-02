package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving;

public class PerfectNumber {

  static int perfectNumber(int A) {

    if (A == 1) {
      return 0;
    }

    int sum = 1;

    for (int num = 2; num * num <= A; num++) {
      if (A % num == 0) {
        sum += num;
        if (num * num != A) {
          sum += A / num;
        }
      }
    }

    if (sum == A) {
      return 1;
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(perfectNumber(16));
    System.out.println("------------");
    System.out.println(perfectNumber(6));
  }
}

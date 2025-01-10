package moules.Intermediate_DSA.L1_Introduction_to_Problem_Solving;

public class CountPrime {

  static int countFactors(int A) {
    int count = 0;

    for (int num = 1; num * num <= A; num++) {
      if (A % num == 0) {
        count += num * num == A ? 1 : 2;

        if (count > 2) {
          break;
        }
      }
    }

    return count;
  }

  static int countPrime(int A) {
    int count = 0;

    for (int num = 2; num <= A; num++) {
      if (countFactors(num) == 2) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println(countPrime(19));
    System.out.println("--------");
    System.out.println(countPrime(1));
    System.out.println();
  }
}

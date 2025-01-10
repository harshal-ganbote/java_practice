package moules.Intermediate_DSA.L1_Introduction_to_Problem_Solving;

public class IsPrime {

  static int countFactors(int A) {
    int ans = 0;

    for (int num = 1; num * num <= A; num++) {
      if (A % num == 0) {
        ans += num * num == A ? 1 : 2;

        if (ans > 2) {
          break;
        }
      }
    }

    return ans;
  }

  static int isPrime(int A) {
    int factors = countFactors(A);

    if (factors == 2) {
      return 1;
    }

    return 0;
  }


  public static void main(String[] args) {
    System.out.println(isPrime(7));
    System.out.println("----------------");
    System.out.println(isPrime(14));
  }
}

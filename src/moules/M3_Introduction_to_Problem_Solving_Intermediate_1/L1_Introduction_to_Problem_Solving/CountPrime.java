package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving;

public class CountPrime {

  static int countFactors(int A) {
   int ans = 0;

   for (int num = 1; num * num <= A; num++) {
     if (A % num == 0) {
       ans += num * num == A ? 1 : 2;

       if (ans > 2) {
         return ans;
       }
     }
   }

    return ans;
  }

  static int countPrime(int A) {
    int ans = 0;

    for (int num = 2; num <= A; num++) {
      if (countFactors(num) == 2) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println(countPrime(19));
    System.out.println("--------");
    System.out.println(countPrime(1));
    System.out.println();
  }
}

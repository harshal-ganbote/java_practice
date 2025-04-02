package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving;

public class CountFactor {

  static int countFactors(int A) {
   int ans = 0;

   for (int num = 1; num * num <= A; num++) {
     if (A % num == 0) {
       ans += num * num == A ? 1 : 2;
     }
   }

   return ans;
  }

  public static void main(String[] args) {
    System.out.println(countFactors(24));
    System.out.println("------------------");
    System.out.println(countFactors(7));
  }
}

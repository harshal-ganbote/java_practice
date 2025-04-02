package moules.M3_Introduction_to_Problem_Solving_Intermediate_1.L1_Introduction_to_Problem_Solving;

public class MakeIt {

  static int makeIt(int A, int B) {
    int totalNumberOfSlice = A * 3 + B;
    return totalNumberOfSlice / 2;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(makeIt(19, 0));
    System.out.println("------");
    System.out.println(makeIt(7, 1));
    System.out.println();
  }
}

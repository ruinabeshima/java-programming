public class assignment5C2_1W25CF09 {
  public static void main(String args[]) {
    int n = 0;
    for (int i = 120; i <= 150; i++) {
      n += i;
    }

    int answer = 0;
    for (int m = 0; m <= 50; m++) {
      answer += m * n - m;
    }

    System.out.println("The answer is: " + answer);
  }
}

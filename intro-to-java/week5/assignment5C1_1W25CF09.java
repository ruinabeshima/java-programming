
public class assignment5C1_1W25CF09 {
  public static void main(String args[]) {
    int m = 0;
    int n = 0;

    for (int i = 0; i <= 500; i++) {
      m += i;
    }

    for (int i = 120; i <= 150; i++) {
      n += i;
    }

    int answer = m - 10 * n;
    System.out.println("The answer is: " + answer);
  }
}